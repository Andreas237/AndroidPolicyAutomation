.class public Lo/blb;
.super Landroid/widget/ImageView;
.source "SourceFile"


# instance fields
.field c:Lcom/huawei/health/sns/model/circle/UserCircle;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 26
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    return-void
.end method


# virtual methods
.method public getUserCircle()Lcom/huawei/health/sns/model/circle/UserCircle;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/blb;->c:Lcom/huawei/health/sns/model/circle/UserCircle;

    return-object v0
.end method

.method public setUserCircle(Lcom/huawei/health/sns/model/circle/UserCircle;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lo/blb;->c:Lcom/huawei/health/sns/model/circle/UserCircle;

    .line 37
    return-void
.end method
