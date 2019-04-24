.class public Lo/adr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(IIIIIII)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput p1, p0, Lo/adr;->d:I

    .line 22
    iput p2, p0, Lo/adr;->e:I

    .line 23
    iput p3, p0, Lo/adr;->c:I

    .line 24
    iput p4, p0, Lo/adr;->a:I

    .line 25
    iput p5, p0, Lo/adr;->b:I

    .line 26
    iput p6, p0, Lo/adr;->f:I

    .line 27
    iput p7, p0, Lo/adr;->g:I

    .line 28
    return-void
.end method
