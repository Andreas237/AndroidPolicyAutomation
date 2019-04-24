.class public Lo/adq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput p1, p0, Lo/adq;->b:I

    .line 19
    iput p2, p0, Lo/adq;->c:I

    .line 20
    iput p3, p0, Lo/adq;->a:I

    .line 21
    iput p4, p0, Lo/adq;->d:I

    .line 22
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 25
    iget v0, p0, Lo/adq;->b:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 37
    iput p1, p0, Lo/adq;->c:I

    .line 38
    return-void
.end method

.method public d()I
    .locals 1

    .line 33
    iget v0, p0, Lo/adq;->c:I

    return v0
.end method
