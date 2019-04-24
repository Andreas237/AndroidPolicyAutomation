.class Lo/dhq$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dhq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private c:J

.field private e:Lo/dhi;


# direct methods
.method public constructor <init>(JLo/dhi;)V
    .locals 2

    .line 784
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 761
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dhq$b;->c:J

    .line 785
    iput-wide p1, p0, Lo/dhq$b;->c:J

    .line 786
    iput-object p3, p0, Lo/dhq$b;->e:Lo/dhi;

    .line 787
    return-void
.end method


# virtual methods
.method public b()Lo/dhi;
    .locals 1

    .line 773
    iget-object v0, p0, Lo/dhq$b;->e:Lo/dhi;

    return-object v0
.end method

.method public d()J
    .locals 2

    .line 769
    iget-wide v0, p0, Lo/dhq$b;->c:J

    return-wide v0
.end method
