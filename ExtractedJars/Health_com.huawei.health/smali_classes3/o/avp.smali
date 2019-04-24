.class public Lo/avp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# instance fields
.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 22
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/avp;->b:Z

    .line 23
    return-void
.end method

.method public e(II)V
    .locals 1

    .line 28
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/avp;->b:Z

    .line 29
    return-void
.end method
