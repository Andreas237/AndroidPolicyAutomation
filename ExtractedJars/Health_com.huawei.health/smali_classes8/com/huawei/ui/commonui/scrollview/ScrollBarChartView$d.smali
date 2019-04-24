.class public final enum Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

.field public static final enum b:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

.field private static final synthetic c:[Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

.field public static final enum d:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

.field public static final enum e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 847
    new-instance v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->a:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    new-instance v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    const-string v1, "LEFT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->d:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    new-instance v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    const-string v1, "RIGHT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->b:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    new-instance v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    const-string v1, "VERTICAL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    .line 846
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->a:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->d:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->b:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->c:[Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 846
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;
    .locals 1

    .line 846
    const-class v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    return-object v0
.end method

.method public static values()[Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;
    .locals 1

    .line 846
    sget-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->c:[Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-virtual {v0}, [Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    return-object v0
.end method
