.class final Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->a(Lo/bml$b;)V
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
.field final synthetic c:Lo/bml$b;


# direct methods
.method constructor <init>(Lo/bml$b;)V
    .locals 0

    .line 365
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$3;->c:Lo/bml$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 365
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$3;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 2

    .line 369
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$3;->c:Lo/bml$b;

    invoke-static {v0, v1}, Lo/bml;->a(Landroid/content/Context;Lo/bml$b;)V

    .line 371
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
