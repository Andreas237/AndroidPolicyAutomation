.class final Lo/rk$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/rk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final b:I

.field private final d:I


# direct methods
.method private constructor <init>(II)V
    .locals 0

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 151
    iput p1, p0, Lo/rk$a;->b:I

    .line 152
    iput p2, p0, Lo/rk$a;->d:I

    .line 153
    return-void
.end method

.method synthetic constructor <init>(IILo/rk$2;)V
    .locals 0

    .line 146
    invoke-direct {p0, p1, p2}, Lo/rk$a;-><init>(II)V

    return-void
.end method


# virtual methods
.method c()I
    .locals 1

    .line 156
    iget v0, p0, Lo/rk$a;->b:I

    return v0
.end method

.method e()I
    .locals 1

    .line 160
    iget v0, p0, Lo/rk$a;->d:I

    return v0
.end method
