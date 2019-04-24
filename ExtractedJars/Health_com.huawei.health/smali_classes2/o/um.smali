.class public final Lo/um;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final b:Z


# direct methods
.method constructor <init>(Z)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-boolean p1, p0, Lo/um;->b:Z

    .line 33
    return-void
.end method


# virtual methods
.method public d([Lo/ou;)V
    .locals 3

    .line 48
    iget-boolean v0, p0, Lo/um;->b:Z

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    array-length v0, p1

    const/4 v1, 0x3

    if-ge v0, v1, :cond_1

    .line 49
    :cond_0
    return-void

    .line 51
    :cond_1
    const/4 v0, 0x0

    aget-object v2, p1, v0

    .line 52
    const/4 v0, 0x2

    aget-object v0, p1, v0

    const/4 v1, 0x0

    aput-object v0, p1, v1

    .line 53
    const/4 v0, 0x2

    aput-object v2, p1, v0

    .line 55
    return-void
.end method
