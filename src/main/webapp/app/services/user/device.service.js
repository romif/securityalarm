(function () {
    'use strict';

    angular
        .module('securityalarmApp')
        .factory('Device', Device);

    Device.$inject = ['$resource'];

    function Device ($resource) {
        var service = $resource('api/devices/:login', {}, {
            'query': {method: 'GET', isArray: true}
        });

        return service;
    }
})();