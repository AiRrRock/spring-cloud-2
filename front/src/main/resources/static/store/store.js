angular.module('market-front').controller('storeController', function ($scope, $http, $location, $localStorage) {

    $scope.loadProducts = function () {
        $http({
            url: 'http://localhost:5555/product-service/api/v1/products',
            method: 'GET'
        }).then(function (response) {
            console.log(response);
            $scope.products = response.data;
        });
    };


    $scope.loadProducts();
});