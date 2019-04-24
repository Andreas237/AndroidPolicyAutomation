.class final Lo/eam$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eam;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lo/eaf;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic d:Lo/eaf;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lo/eaf;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lo/eam$2;->a:Ljava/lang/String;

    iput-object p2, p0, Lo/eam$2;->e:Ljava/lang/String;

    iput-object p3, p0, Lo/eam$2;->d:Lo/eaf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 87
    invoke-static {}, Lo/eam;->b()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 88
    invoke-static {}, Lo/eam;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/eam$2;->a:Ljava/lang/String;

    iget-object v2, p0, Lo/eam$2;->e:Ljava/lang/String;

    iget-object v3, p0, Lo/eam$2;->d:Lo/eaf;

    invoke-static {v0, v1, v2, v3}, Lo/eam;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lo/eaf;)V

    .line 90
    :cond_0
    return-void
.end method
