.class final Lo/rj$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/rj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/rj$a;>;Ljava/io/Serializable;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 432
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/rj$3;)V
    .locals 0

    .line 432
    invoke-direct {p0}, Lo/rj$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/rj$a;Lo/rj$a;)I
    .locals 2

    .line 436
    invoke-virtual {p1}, Lo/rj$a;->a()I

    move-result v0

    invoke-virtual {p2}, Lo/rj$a;->a()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 432
    move-object v0, p1

    check-cast v0, Lo/rj$a;

    move-object v1, p2

    check-cast v1, Lo/rj$a;

    invoke-virtual {p0, v0, v1}, Lo/rj$c;->a(Lo/rj$a;Lo/rj$a;)I

    move-result v0

    return v0
.end method
