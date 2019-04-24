.class final Lo/bzu$c$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bzu$c;->e(Ljava/lang/String;Lo/cza;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cza;


# direct methods
.method constructor <init>(Lo/cza;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lo/bzu$c$1;->c:Lo/cza;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 4

    .line 42
    const-string v0, "CommonUtilSug"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GRSManagerSug onCallBackFail i = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    iget-object v0, p0, Lo/bzu$c$1;->c:Lo/cza;

    invoke-interface {v0, p1}, Lo/cza;->onCallBackFail(I)V

    .line 44
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 4

    .line 26
    const-string v0, "CommonUtilSug"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GRSManagerSug onCallBackSuccess url = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 28
    const-string v0, "CommonUtilSug"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GRSManagerSug onCallBackSuccess null == url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    iget-object v0, p0, Lo/bzu$c$1;->c:Lo/cza;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Lo/cza;->onCallBackFail(I)V

    goto :goto_0

    .line 31
    :cond_0
    const-string v0, "http://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "https://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 32
    :cond_1
    iget-object v0, p0, Lo/bzu$c$1;->c:Lo/cza;

    invoke-interface {v0, p1}, Lo/cza;->onCallBackSuccess(Ljava/lang/String;)V

    goto :goto_0

    .line 34
    :cond_2
    const-string v0, "CommonUtilSug"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GRSManagerSug onCallBackSuccess url not http:// or https:// , url = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    iget-object v0, p0, Lo/bzu$c$1;->c:Lo/cza;

    const/16 v1, -0x63

    invoke-interface {v0, v1}, Lo/cza;->onCallBackFail(I)V

    .line 38
    :goto_0
    return-void
.end method
