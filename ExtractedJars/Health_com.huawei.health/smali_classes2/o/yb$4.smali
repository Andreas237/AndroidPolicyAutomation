.class Lo/yb$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/wo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/yb;->a(JIILandroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/yb;


# direct methods
.method constructor <init>(Lo/yb;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lo/yb$4;->d:Lo/yb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 127
    const-string v0, "PluginSocial_NormalRankViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    return-void
.end method

.method public b()V
    .locals 0

    .line 138
    return-void
.end method

.method public d(ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 143
    return-void
.end method

.method public e()V
    .locals 4

    .line 132
    const-string v0, "PluginSocial_NormalRankViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    return-void
.end method
