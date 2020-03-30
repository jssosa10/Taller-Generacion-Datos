/**
 * Created by Sandeep on 01/06/14.
 */

angular.module('movieApp.services', []).factory('Movie', function ($resource) {
    return $resource('https://my.api.mockaroo.com/movie.json?key=aaa41230', { id: '@_id' }, {
        update: {
            method: 'PUT'
        }
    });
}).service('popupService', function ($window) {
    this.showPopup = function (message) {
        return $window.confirm(message);
    }
});