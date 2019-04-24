.class final Lo/apr$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/apr;->a(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic d:J


# direct methods
.method constructor <init>(J)V
    .locals 0

    .line 87
    iput-wide p1, p0, Lo/apr$1;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 91
    new-instance v0, Lo/atg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lo/apr$1;->d:J

    invoke-virtual {v0, v1, v2}, Lo/atg;->b(J)Ljava/util/ArrayList;

    .line 92
    return-void
.end method

.method public e(II)V
    .locals 0

    .line 97
    return-void
.end method
