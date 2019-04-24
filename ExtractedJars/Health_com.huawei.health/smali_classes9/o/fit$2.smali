.class Lo/fit$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fit;->d(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fit;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/fit;Ljava/lang/String;)V
    .locals 0

    .line 383
    iput-object p1, p0, Lo/fit$2;->c:Lo/fit;

    iput-object p2, p0, Lo/fit$2;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 386
    const-string v0, "UIME_WeChatInteactors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindTitle setPositiveButton"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    iget-object v0, p0, Lo/fit$2;->c:Lo/fit;

    iget-object v1, p0, Lo/fit$2;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/fit;->d(Lo/fit;Ljava/lang/String;)V

    .line 388
    return-void
.end method
