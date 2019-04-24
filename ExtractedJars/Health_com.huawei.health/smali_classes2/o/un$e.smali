.class public final Lo/un$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/un;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private final b:I

.field private final e:I


# direct methods
.method constructor <init>(II)V
    .locals 0

    .line 223
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 224
    iput p1, p0, Lo/un$e;->e:I

    .line 225
    iput p2, p0, Lo/un$e;->b:I

    .line 226
    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 233
    iget v0, p0, Lo/un$e;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    .line 229
    iget v0, p0, Lo/un$e;->e:I

    return v0
.end method
