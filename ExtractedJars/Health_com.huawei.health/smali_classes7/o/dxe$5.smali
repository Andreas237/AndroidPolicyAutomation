.class final Lo/dxe$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dxe;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic e:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lo/dxe$5;->e:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 110
    iget-object v0, p0, Lo/dxe$5;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dxe;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 112
    const-string v0, "AchievementMockUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert storedemo achievement: try again"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    iget-object v0, p0, Lo/dxe$5;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dxe;->e(Landroid/content/Context;)Z

    .line 116
    :cond_0
    return-void
.end method
