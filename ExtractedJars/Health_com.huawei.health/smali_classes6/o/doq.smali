.class public Lo/doq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:J

.field public d:Ljava/lang/String;

.field public e:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doq;->b:Ljava/lang/String;

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doq;->d:Ljava/lang/String;

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doq;->a:Ljava/lang/String;

    return-void
.end method
