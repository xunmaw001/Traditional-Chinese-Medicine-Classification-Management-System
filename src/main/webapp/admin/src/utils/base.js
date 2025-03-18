const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmi9m34/",
            name: "ssmi9m34",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmi9m34/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "中药分类管理系统"
        } 
    }
}
export default base
