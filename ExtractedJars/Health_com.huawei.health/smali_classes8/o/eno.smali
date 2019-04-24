.class public Lo/eno;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:I

.field private static d:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    const/16 v0, 0x18

    sput v0, Lo/eno;->b:I

    .line 24
    const/high16 v0, 0x40400000    # 3.0f

    sput v0, Lo/eno;->d:F

    return-void
.end method
