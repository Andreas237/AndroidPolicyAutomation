.class Lo/daz$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/daz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private c:I

.field private d:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 220
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 221
    iput p1, p0, Lo/daz$c;->d:I

    .line 222
    iput p2, p0, Lo/daz$c;->c:I

    .line 223
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 226
    iget v0, p0, Lo/daz$c;->d:I

    return v0
.end method

.method public b()I
    .locals 1

    .line 234
    iget v0, p0, Lo/daz$c;->c:I

    return v0
.end method
