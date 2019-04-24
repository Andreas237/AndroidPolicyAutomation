.class public final Lo/tl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:[I

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([I)V
    .locals 0

    .line 50
    iput-object p1, p0, Lo/tl;->c:[I

    .line 51
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 34
    iput p1, p0, Lo/tl;->b:I

    .line 35
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lo/tl;->a:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 58
    iput-boolean p1, p0, Lo/tl;->d:Z

    .line 59
    return-void
.end method
