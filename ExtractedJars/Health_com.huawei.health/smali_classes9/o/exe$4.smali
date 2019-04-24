.class final Lo/exe$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/exf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exe;->a(Lo/exf;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exf;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Lo/exf;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lo/exe$4;->c:Ljava/lang/String;

    iput-object p2, p0, Lo/exe$4;->a:Lo/exf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 66
    const/16 v0, 0xc8

    if-ne v0, p1, :cond_0

    .line 67
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dowloadCasePhoneXML rescode ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dowloadCasePhoneXML resultValue ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    invoke-static {p2}, Lo/exe;->a(Ljava/lang/String;)Lo/exc;

    move-result-object v0

    iget-object v1, p0, Lo/exe$4;->c:Ljava/lang/String;

    iget-object v2, p0, Lo/exe$4;->a:Lo/exf;

    invoke-static {v0, v1, v2}, Lo/exe;->e(Lo/exc;Ljava/lang/String;Lo/exf;)V

    .line 71
    :cond_0
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 2

    .line 74
    iget-object v0, p0, Lo/exe$4;->a:Lo/exf;

    const/4 v1, -0x1

    invoke-interface {v0, v1, p2}, Lo/exf;->d(ILjava/lang/String;)V

    .line 75
    return-void
.end method
