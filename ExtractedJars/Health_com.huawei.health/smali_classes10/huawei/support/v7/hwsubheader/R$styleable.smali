.class public final Lhuawei/support/v7/hwsubheader/R$styleable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/support/v7/hwsubheader/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static final HwSubHeader:[I

.field public static final HwSubHeader_stick:I = 0x0


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 68
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lhuawei/support/v7/hwsubheader/R$styleable;->HwSubHeader:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x7f010155
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
