.class public Lo/emy;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/emy;


# instance fields
.field private a:I

.field private d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const/4 v0, -0x2

    iput v0, p0, Lo/emy;->a:I

    return-void
.end method

.method public static e(Landroid/content/Context;)Lo/emy;
    .locals 1

    .line 42
    sget-object v0, Lo/emy;->b:Lo/emy;

    if-nez v0, :cond_0

    .line 43
    new-instance v0, Lo/emy;

    invoke-direct {v0}, Lo/emy;-><init>()V

    sput-object v0, Lo/emy;->b:Lo/emy;

    .line 46
    :cond_0
    sget-object v0, Lo/emy;->b:Lo/emy;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 104
    iget v0, p0, Lo/emy;->a:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 88
    iput p1, p0, Lo/emy;->d:I

    .line 89
    return-void
.end method

.method public d()I
    .locals 1

    .line 96
    iget v0, p0, Lo/emy;->d:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 100
    iput p1, p0, Lo/emy;->a:I

    .line 101
    return-void
.end method
