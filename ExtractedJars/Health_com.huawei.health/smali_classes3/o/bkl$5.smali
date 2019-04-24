.class final Lo/bkl$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bkl;->b(Landroid/app/Activity;Lo/axd;Lcom/huawei/health/sns/model/user/User;)Lo/boj$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/axd;

.field final synthetic d:Lcom/huawei/health/sns/model/user/User;

.field final synthetic e:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lo/axd;Landroid/app/Activity;Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lo/bkl$5;->b:Lo/axd;

    iput-object p2, p0, Lo/bkl$5;->e:Landroid/app/Activity;

    iput-object p3, p0, Lo/bkl$5;->d:Lcom/huawei/health/sns/model/user/User;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/widget/EditText;)V
    .locals 0

    .line 143
    return-void
.end method

.method public d(Landroid/widget/EditText;)V
    .locals 6

    .line 136
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 137
    iget-object v0, p0, Lo/bkl$5;->b:Lo/axd;

    iget-object v1, p0, Lo/bkl$5;->e:Landroid/app/Activity;

    iget-object v2, p0, Lo/bkl$5;->d:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x21

    invoke-virtual {v0, v4, v1, v2, v3}, Lo/axd;->c(ILandroid/app/Activity;Lcom/huawei/health/sns/model/user/User;Ljava/lang/String;)V

    .line 138
    return-void
.end method
