.class public Lo/bcn;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bcn$d;
    }
.end annotation


# instance fields
.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bcn$d;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bcn;->d:Ljava/util/List;

    .line 24
    new-instance v2, Lo/bcn$d;

    sget v0, Lcom/huawei/android/sns/R$string;->sns_tab_message:I

    const/4 v1, 0x0

    invoke-direct {v2, v0, v1}, Lo/bcn$d;-><init>(ILo/bcn$4;)V

    .line 25
    new-instance v3, Lo/bcn$d;

    sget v0, Lcom/huawei/android/sns/R$string;->sns_tab_user:I

    const/4 v1, 0x0

    invoke-direct {v3, v0, v1}, Lo/bcn$d;-><init>(ILo/bcn$4;)V

    .line 26
    iget-object v0, p0, Lo/bcn;->d:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    iget-object v0, p0, Lo/bcn;->d:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    return-void
.end method


# virtual methods
.method public b(I)Lo/bcn$d;
    .locals 2

    .line 32
    const/4 v1, 0x0

    .line 33
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/bcn;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 35
    iget-object v0, p0, Lo/bcn;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/bcn$d;

    .line 38
    :cond_0
    return-object v1
.end method
