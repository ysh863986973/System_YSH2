<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>填写与核对订单</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/order.ordersubmit.css">
    <script type="application/javascript"
            src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.js"></script>
    <script type="application/javascript"
            src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
    <script type="application/javascript" src="${pageContext.request.contextPath}/resources/layui/layui.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/vue"></script>
</head>
<body style="position: static">
<div id="app" class="bgGray">
    <div data-v-95ac8d30="" class="header3">
        <div data-v-95ac8d30="" class="layout clear">
            <div data-v-95ac8d30="" class="left logo">
                <a data-v-95ac8d30="" href="${pageContext.request.contextPath}/index">
                    <img data-v-95ac8d30=""
                         src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAKYAAAAqCAYAAAA5+iDUAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA3FpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNS1jMDE0IDc5LjE1MTQ4MSwgMjAxMy8wMy8xMy0xMjowOToxNSAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDo1NWY1ODZmZS0yNGNjLTg2NGMtODFmMi0yNjYzODhhNjczYTMiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6QjgwRkFGQ0U4MzFDMTFFNzkzM0FCMEZGM0ZFMDMzQ0UiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6QjgwRkFGQ0Q4MzFDMTFFNzkzM0FCMEZGM0ZFMDMzQ0UiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChXaW5kb3dzKSI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOmU1YTliNDEzLTU2NDEtMDc0MS05OTA2LTZhNDg5YjU1NzNlYyIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDo1NWY1ODZmZS0yNGNjLTg2NGMtODFmMi0yNjYzODhhNjczYTMiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4gl02RAAANUElEQVR42uxdD5BWVRW/y8Ky8UcQQQ1MQaCIAAEBdxEJtJrCyYgBg2gmFJJSWU0lAyc1E4eRCiYUa8iEHPrnCEsRMVoGocsuoKwYSgryTxGXv8uy67qC2/mxvzccLve+733/tv3a78ycee9779zz7r3vvHPPOffc+7U0jQgbTNt2cpggeL1gH8FPCZ5nkR0U3CP4suCvCk31Fg+vnnKYKHitYA/BroKtFclHggcEdwj+U/Bx4XVElR8ohy0Rq17DOm0XfFbw98LrY5OFtEFOIwrlaLxQwYviKIaXP16EYIXigzo/KHifYG4cvN4VHCK8DpDP9+SwKMHmPCN8bsyKT/qgRSMJZX85/DVOoQzq94h17QeC98cplIBugrer34VJNGmCtOmKrPhkuGAKLBT8RIJl+4gQtKSAXyqHh5KoR191XpBkmwZkxSeDBZOa5fNJsKgXPMXzqYJ5SfA6xTp1lkPvJJt2Mis+ma0xJ4fcmys4QvAGwQ88NIfFnqvn+bc8NJWCkwSvjqFRD/N4VQjNw4KDBEfSafLBwaz4pA9aNsIzvuy5vlsEbpbSrLWe4f4N3u8lh8s9vJ4UXn8gXWvaoMbHK4Z9uVJ4lZPX63IY7aHbnhWfDBVMebFd5NDfc3udooPAne+hK+fx2pBHrVPnQ0LoymPYlx8omjBeh0R434nYBx080Y9KNRK4yuWE3bdo8R7bmbM8u+pjifCWe1AOOuxWJ7Q1Ic+ql/uVmaYxrw7tz2iOyKYINJvVuW+YRujpFenY3BCazdLJJ5XmHRTheb6X30oO8wTvcNi5M+U582OwKBIeG4Vug8V3hOO9jRJ8QJssQjfewXMrY7nz5P4v5Hyv4pvPPr7fGiWWy72F6veXBGep3wfkPsyoDcLvw0wRzMKIghlGV8bj4BCaSsvzdn3Bb0jHVUknDrC1i6dOg0McrQ18mW08NND+S2in2vWcIrhWynb08K6Sep6iwzhL6IbK73183oVyWB+h3y/w2Mdw+CCYYzECQciVNhwu+A9HmXFEH1wsuEqwQyZpTJ/AnRDcFkHLwfF5U3WqD7ZCA8hxqdD3bYSPpZTHYsEvxtEfeHkrYtBgBus9Ph9x32Jp2zUUoGRCXAeFxw6aVz157TfQdhzWk+G9kR9T0xdM2iJDYjWENs2gMAHgVGabkMfBRl0g+IjQ/k6Oi3xTmXEIZkFI+KpUntPCJB8LtWGP1Ps94d2dmijQ3E8y6tDJsqcN7cECxyhT6zGJtBL4huBrgnME8x28O1k+At7Zi6xTe8eolhEa8wrjD6qXWR37HQ/dv3mMartAeKcB5eWiAx+SF/18RMHcJbTvq9/DPXSvC91x4d/Pejmp+Z7ddSxUH2q5dW+gJZgQHsxw2XHWvZ52BbyXEzWMtwRzt+Cdgn8P+aCbvGCGxQpLLO9xSfjYW/2RCAKG/s/F8Xw4Cc9JuVuk/GJqXthen44xPIPuEtMwhRlW98G0GfMtL9aoj6k2zj4L7Mde9oun0wanq20MHrlKO2q4TvAFB+8S4Y0+iZLQ0tNDV5pJgjk8go0WDyBp4xnBVnGWgwe5OJ6PJUbdy/ix/FZeKJwSxE8vtGj+ZRqmYfWEQIWUuSVinX9ObTVAPbN/BKE0IRGJjTyfSS++i3oXyZgkO6VdFZkkmL7GviUNOaS0030eYYO99ZTSmiuFti8F9Jsm+tRkDymXJ+Xr4vhYCmINt8Lz+wwH2ckkxXz5dwl+TV1/gbajD04iNkrbHEJTJLia5skGx/AObQzT4zLr+gGaUNpLfk14n6A9j5jqPXAUlcBOsCMDdFA/aV3fxzIaVqdDeNIimAxr9IwwZOJFPeyh+6XgU9aQjtzKm6TcvXK8WfC7jhfja2ediR5YLwgJS22X559PreaCsUQbMEGwK6SOL9H8GMZzbRJg+LzN8QEstGiD599tCVtgAyJUtcghsIUOjb2XTpdu+0hHvSsyRjCjaJyoHjI9cruedRTcRwXHmIZUuGt8woRQC73oYR6aV1RgPc/4Y6ZlSBAWmoI09FmJx4xA3eocz5xIjGIm+ZyqMuEL86Cfdf0BT6jL9WFdiTpmimCmMlaIRvf22DYw5FdJ5z4X4rkHc9p9Q7xobV8O8jgzuu5XpaHPNno+6pIUZEOVenijPUNN/LmtASC2ujWTNKZP4KoZN4ulWY8gsB7jhWjN0DWkLlvidMaifFT9jHt2KQDbUz/JtieiMUtVBMDw44qSFXaCoSNEPd7y9CXa8xXFO2z2popt0rb9pmCkafKCyaUPvqFQB9bzjT+wvl6FZKJo3mExbLdUmBenAuGRNoyP0QcI8k9SlxZLmVsj9N2lDoejRMrup10Lx+/HEV/FXwQnB8kaDlMAU5Nvyv3/yD2YRU/QBvW1HfXC0pivevqtyWvMy0OGTO1gjAx5/lo1rJoIvK4LoVsbQ+BOz7bw5eUylOKCzZxrxwd1cZwjxtsxPPLjTK6wy+2jUJ5HL1o7VVjD1M3y0qElO/P3JA6zcz2aGPZyvfCG8/gsbUUfb4xyD5pzp1/LMkkww2yh0dIRNzM8dFcI3Soee4XQTBFevdmBvi/9VYZgoG36eGjel/tj+TGNccQk7TohNrk4zj6ZR/QBQk8LHIIZBNbLrPrP5dA6R117mRr1eRV+myPli6UPtnts10tY7gLlVEKzI7tosmVOfJ0mislUjdk55N5AKwThtPcYFjLmTBDYBdOIYfB0hGEcZsCKCO1aFoFX4haQW9OiH76ghBJD6r3UcE84nDwsMf6Z4A+19qNwD7XoEQ4ap4Syiv0JJ2y2Rbtb8DHbhrWmcDPC+UkG5lu2TaJwTH0EhUnWCVpnVwQnKhE4Haf02NyzLSGBgP2UaMNUooZtIal+S63fGDH+6KnjXMc12Ju/ziTB3JSkAPzJGp7GJcjrdpXFnVS6mGmYhTGM+eVTM/mgm9Wvh2n7eW1lximHm/inWxPVxKmAknRqp5QLJr08fNH3xFGsnl/fDOs6ho8JNAGiAkIfM6QeyyhMyaSnwXmYFCTqyrHa+NcdBal+lVa/YsOGtRGeNTwN7zedglmaUYLJFzhTXtJyarvPUosgYztY+4IpwKO0XWDTrFRDpeaD9DIEsxGewZReT9qdelg6bhqmxXaahqzt1ShnRQmOEMPgJIVqH+21vyFsFedWMBgy21imSNQRpHsMTZwIvKS0eCp515lz0+9SCo22RUxzAPmI4NE+ri5tEcEenO2Z/w/nJ93C09LhCPjW7oSBvWZnm2M4LuXanu4cJWIlPPtWNqZlJWKzEkymVgERFG5Lg76jepnQ0pj6akGaXHqEwVG/dH0tTw2TWpCCsoDW5tys+ahTeMlADdtU4HAQpnu82nj71WVLaxvd91uf15ozycswd2CmYFe8YLr0BE2aGg7Xwe/jNEsqeaxS5UBTo5f4plwwGe9CgBlzzxdRQDqy0+3zdsT2FIY2JsUr5TIIYEd2Muem+pV6QjupgA4xNHhjj0TBx1JDPEGBruHxmMKj6hxRC6zRr9Dz7i2FITK8EdW/lEKZtTsT835tbRmsSixsRv3QIQnlhOnRCjppxTmU9jylDbVGDIbMYBjVQ6udJ2nv4OAaVm1oF9GcyDPhqySTGTHapYAPEpaRVlekriFENNskHu87libhCYbiWKCH/TDvvCbk94fmzJ5U1Rz+A1s7uFfNtlYGWpSrDbKQhaxXHstbzvVtM8JAeVtMsVnXc6zhA2tnTkR8pnacTttIek8fz04btUJTy/uYBWoRGP4ceVoxEB9sE2N7Lac8bWhvxV+Dex1NjH2OPH2J9UZI0thF+xdQHmwYZtFD06+Te682FXlo0USEsogGMZZA/JnZQDYgjesg1xPZds1RhVUM7keB9VbZHRb/RdZ9oE6QwPm7XGMOwCK5Zer+9Y7yri1esCPeMeHTw3HvaLx2G50I5E0iCRjLL7DxBPYcGmv1+2cEMTGBLKWlcl5O7NrsBVM6AQFoLEgbTdsWnXq3g/QO2jzTPax6EEfBmaO2iwLTWa4X+2OEdf8nijdwgcNmW8MkX1tAMPefw7YhBQ+7rA30tA3ackaK+hRaGv3am3UeYRxJ15g+Rt1NQ0YS+hYbJYxBDmhWYzYsU8CCq80c4qaYhtV/uqMRuMZmBz8SvJVDpg3lREwl7okjrjaf5bAEo7s5e08lwEzFu5yOjgbkaSIrB3mQXRIQIkzZItEZ6WxTaV4kC0HIpjUdEgjfix7aw2w38E5H+5qtYKLDhmLHDGwexd83WTRF7GhoUgTlb3R8/R2BpiEf9DLuSxkFJrMs+GKnCjtv8TFq4QCXOHggYQUxy0T2hy+itpzFUN0UB01//P2LwljRjlY0AbDxwjshHwVMiJEUynzapCN5vXkLpgjE2zTUv20akl+RtDtPdR4SWZH2f6XQogNvM2dvJPCxUQkK1JT4HcVZ2G+FN3ZaIRJszIDspmKFE62QziE6JtOoPSs8oZf9DsFoQ8EYxbahD26wyNCWp6069IjRp9CSj7Jt/flBDTTWMl2hWyOIZ4/iaDCRv9f8r+Uip76+3mQhC00N/ivAABMGE0g2X40vAAAAAElFTkSuQmCC">
                </a>
            </div>
            <div data-v-95ac8d30="" class="header3Nav right">|<a data-v-95ac8d30=""
                                                                 href="${pageContext.request.contextPath}/myMain">我的订单</a>|<a
                    data-v-95ac8d30=""
                    href="${pageContext.request.contextPath}/logoff">退出</a></div>
            <div data-v-95ac8d30="" class="header3User right"><i data-v-95ac8d30=""
                                                                 class="iconfont icon-phone"></i><span
                    data-v-95ac8d30="" class="sp1">400-919-8000</span><span data-v-95ac8d30=""
                                                                            class="sp2">欢迎您!${user.email}</span><span
                    data-v-95ac8d30="" class="sp3"></span></div>
        </div>


    </div>


    <div class="checkOrderTit">
        <div class="layout">
            <div class="checkOrderTitCom">
                <div class="checkOrderTitComT">
                    <div class="td1 bgRed"></div>
                    <div class="td2 bgRed">1</div>
                    <div class="td3 bgRed"></div>
                    <div class="td2 bgRed">2</div>
                    <div class="td3 bgGray1"></div>
                    <div class="td2 bgGray1">3</div>
                    <div class="td1 bgGray1"></div>
                </div>
                <div class="checkOrderTitComB">
                    <div class="bd1 colorRed">选择车辆</div>
                    <div class="bd2 colorRed">填写和核对订单</div>
                    <div class="bd1 colorGray">提交成功</div>
                </div>
            </div>
        </div>
    </div>

    <div class="orderMsg clear">

        <div class="orderMsgs">
            <div class="orderMsgL left">
                <img :src="infos.carPicture">
                <p>{{infos.carType}}|{{infos.carSeating}}座</p>

            </div>
            <div class="orderMsgR left">
                <div class="carTitle">
                    <span class="carTitle1 left">{{infos.carName}}</span>
                </div>

                <div class="selCarMsg">
                    <div class="selCarMsgCom">
                        <div class="MsgTit">取车</div>
                        <div class="Msg">取车地址：{{getcitys.cityName}}</div>
                    </div>

                    <div class="selCarMsgCom">
                        <div class="MsgTit">还车</div>
                        <div class="Msg">还车地址：{{backcitys.cityName}}</div>
                    </div>
                </div>
            </div>
            <div class="costCom right">
                <h3>费用明细</h3>
                <div class="item">
                    <span class="left">基本租金</span>
                    <span class="right">{{infos.carPrice}}元</span>
                </div>
                <div class="item">
                    <span class="left">手续费（35元/单）</span>
                    <span class="right">35元</span>
                </div>
                <div class="item">
                    <span class="left">基本保障服务</span>
                    <span class="right">50元</span>
                </div>
                <div class="payMony">
                    <label class="right">应付金额&nbsp;
                        <span id="total">{{current()}}</span></label>
                </div>

                <button class="buttons right" id="butt" onclick="submitorder()">
                    提交订单
                </button>


            </div>


        </div>

    </div>
</div>


<script type="text/javascript">
    var vm = new Vue({
        el: '.orderMsgs',
        data: {
            infos: [],
            getcitys: '',
            backcitys: ''
        },

        methods: {
            current: function () {
                var total = 0;
                var money = 85;
                total = this.infos.carPrice + money;
                return total;
            }
        }
    });


</script>


<script type="text/javascript">
    $(function () {
        var getid = window.location.search;
        $.ajax({
            type: "get",
            url: "${pageContext.request.contextPath}/car/getAndBackCity" + getid,
            dataType: "json",
            success: function (data) {
                if (data.condition === "1") {
                    vm.getcitys = data.getCity;
                    vm.backcitys = data.backCity;
                }
            },
            error: function () {
                alert("ajax加载失败");
            }

        })
    })

</script>


<script type="text/javascript">
    $(function () {
        var getid = window.location.search;
        $.ajax({
            type: "get",
            url: "${pageContext.request.contextPath}/car/findById" + getid,
            dataType: "json",
            success: function (data) {
                if (data.condition === "1") {
                    vm.infos = data.cars[0];
                } else {
                    alert(data.condition)
                }
            },
            error: function () {
                alert("ajax加载失败");
            }
        })
    })

</script>


<script type="text/javascript">

    function submitorder() {
        var getid = window.location.search;
        var total = $("#total").html();
        $.ajax({
            type: "get",
            url: "${pageContext.request.contextPath}/order/add" + getid + "&carPrice=" + total,
            dataType: "json",
            success: function (data) {
                if (data.condition === "1") {
                    window.location.href = "${pageContext.request.contextPath}/myMain";
                } else {
                    alert(data.condition);
                }
            },
            error: function () {
                alert("ajax加载失败");
            }
        })
    }

</script>


</body>
</html>