.class public Lo/auo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected b:I

.field protected c:I

.field protected d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, -0x1

    iput v0, p0, Lo/auo;->b:I

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/auo;->d:Ljava/lang/String;

    .line 29
    const/4 v0, 0x0

    iput v0, p0, Lo/auo;->c:I

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 53
    iget v0, p0, Lo/auo;->c:I

    return v0
.end method

.method public d()I
    .locals 1

    .line 44
    iget v0, p0, Lo/auo;->b:I

    return v0
.end method
