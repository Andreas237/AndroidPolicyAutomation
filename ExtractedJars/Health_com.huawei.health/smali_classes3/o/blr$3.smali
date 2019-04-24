.class Lo/blr$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/blr;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/blr;


# direct methods
.method constructor <init>(Lo/blr;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lo/blr$3;->b:Lo/blr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/widget/EditText;)V
    .locals 0

    .line 170
    return-void
.end method

.method public d(Landroid/widget/EditText;)V
    .locals 4

    .line 162
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 163
    iget-object v0, p0, Lo/blr$3;->b:Lo/blr;

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/blr$3;->b:Lo/blr;

    iget-object v2, v2, Lo/blr;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-static {v0, v1, v2}, Lo/blr;->c(Lo/blr;Ljava/lang/String;Lcom/huawei/health/sns/model/user/User;)V

    .line 164
    return-void
.end method
