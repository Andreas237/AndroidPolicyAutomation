.class Lhuawei/widget/HwNumberPicker$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/SoundPool$OnLoadCompleteListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhuawei/widget/HwNumberPicker;->initSoundPool()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhuawei/widget/HwNumberPicker;


# direct methods
.method constructor <init>(Lhuawei/widget/HwNumberPicker;)V
    .locals 0

    .line 306
    iput-object p1, p0, Lhuawei/widget/HwNumberPicker$3;->this$0:Lhuawei/widget/HwNumberPicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadComplete(Landroid/media/SoundPool;II)V
    .locals 2

    .line 309
    iget-object v0, p0, Lhuawei/widget/HwNumberPicker$3;->this$0:Lhuawei/widget/HwNumberPicker;

    if-nez p3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lhuawei/widget/HwNumberPicker;->access$002(Lhuawei/widget/HwNumberPicker;Z)Z

    .line 310
    return-void
.end method
