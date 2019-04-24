.class public Lo/deq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public b:Ljava/lang/String;

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/deq;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 11
    iget v0, p0, Lo/deq;->e:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 15
    iput p1, p0, Lo/deq;->e:I

    .line 16
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lo/deq;->b:Ljava/lang/String;

    .line 24
    return-void
.end method
