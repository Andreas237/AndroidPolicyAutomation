.class Lo/emi$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ekw$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/emi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private c:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const/4 v0, 0x5

    iput v0, p0, Lo/emi$b;->c:I

    return-void
.end method

.method synthetic constructor <init>(Lo/emi$5;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lo/emi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/util/List;Lo/elb;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;Lo/elb;)V"
        }
    .end annotation

    .line 45
    invoke-virtual {p2}, Lo/elb;->ah()I

    move-result v0

    iget v1, p0, Lo/emi$b;->c:I

    invoke-static {p1, v0, v1}, Lo/emf;->e(Ljava/util/List;II)V

    .line 46
    return-void
.end method

.method public c()Z
    .locals 1

    .line 50
    const/4 v0, 0x1

    return v0
.end method

.method public d(Ljava/util/List;ILo/elb;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;ILo/elb;)I"
        }
    .end annotation

    .line 55
    new-instance v0, Lo/eml;

    invoke-direct {v0}, Lo/eml;-><init>()V

    invoke-virtual {v0, p1, p2}, Lo/eml;->a(Ljava/util/List;I)I

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    .line 40
    const/4 v0, 0x1

    return v0
.end method
