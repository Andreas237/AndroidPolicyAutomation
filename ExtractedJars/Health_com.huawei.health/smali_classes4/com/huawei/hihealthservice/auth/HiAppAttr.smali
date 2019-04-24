.class Lcom/huawei/hihealthservice/auth/HiAppAttr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private appCnName:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppCnName()Ljava/lang/String;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/HiAppAttr;->appCnName:Ljava/lang/String;

    return-object v0
.end method

.method public setAppCnName(Ljava/lang/String;)V
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/huawei/hihealthservice/auth/HiAppAttr;->appCnName:Ljava/lang/String;

    .line 12
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 16
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, "HiAppAttr{"

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 17
    const-string v0, "appCnName=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/auth/HiAppAttr;->appCnName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 18
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 19
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
