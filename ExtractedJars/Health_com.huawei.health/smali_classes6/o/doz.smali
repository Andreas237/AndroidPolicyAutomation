.class public Lo/doz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const/4 v0, -0x1

    iput v0, p0, Lo/doz;->e:I

    .line 8
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doz;->b:Ljava/lang/String;

    .line 9
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doz;->a:Ljava/lang/String;

    .line 10
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doz;->c:Ljava/lang/String;

    .line 11
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doz;->d:Ljava/lang/String;

    return-void
.end method
