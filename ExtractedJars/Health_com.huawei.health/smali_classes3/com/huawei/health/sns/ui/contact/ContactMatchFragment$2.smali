.class final Lcom/huawei/health/sns/ui/contact/ContactMatchFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->h()Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 464
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 464
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment$2;->d(Lo/bra;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bra;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 469
    invoke-static {}, Lo/awc;->a()Lo/awc;

    move-result-object v0

    invoke-virtual {v0}, Lo/awc;->e()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
