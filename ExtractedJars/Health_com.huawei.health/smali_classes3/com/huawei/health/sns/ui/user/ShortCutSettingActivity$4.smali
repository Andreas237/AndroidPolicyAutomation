.class final Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->e(Lo/bml$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lo/bml$b;


# direct methods
.method constructor <init>(Lo/bml$b;)V
    .locals 0

    .line 345
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$4;->d:Lo/bml$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 345
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$4;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 2

    .line 349
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$4;->d:Lo/bml$b;

    invoke-static {v0, v1}, Lo/bml;->d(Landroid/content/Context;Lo/bml$b;)V

    .line 351
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
