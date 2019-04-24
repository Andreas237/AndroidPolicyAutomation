.class Lo/dhq$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dhq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private a:J

.field private c:Lo/dhl;


# direct methods
.method public constructor <init>(JLo/dhl;)V
    .locals 2

    .line 750
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 727
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dhq$c;->a:J

    .line 751
    iput-wide p1, p0, Lo/dhq$c;->a:J

    .line 752
    iput-object p3, p0, Lo/dhq$c;->c:Lo/dhl;

    .line 753
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 735
    iget-wide v0, p0, Lo/dhq$c;->a:J

    return-wide v0
.end method

.method public c()Lo/dhl;
    .locals 1

    .line 739
    iget-object v0, p0, Lo/dhq$c;->c:Lo/dhl;

    return-object v0
.end method
