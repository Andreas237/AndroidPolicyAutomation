.class public Lo/cyc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 77
    const v0, 0xf4240

    sput v0, Lo/cyc;->e:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()I
    .locals 1

    .line 84
    sget v0, Lo/cyc;->e:I

    return v0
.end method

.method public static e(I)V
    .locals 0

    .line 92
    sput p0, Lo/cyc;->e:I

    .line 93
    return-void
.end method
