const base = {
    get() {
        return {
            url : "http://localhost:8080/wendangguanli/",
            name: "wendangguanli",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/wendangguanli/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "文档管理系统"
        } 
    }
}
export default base
