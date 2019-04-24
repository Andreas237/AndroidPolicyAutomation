.class Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;->init(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;->access$000(Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;)Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar$NpsSeekBarImpl;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 42
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;->access$000(Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar;)Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar$NpsSeekBarImpl;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/huawei/ui/main/stories/nps/component/NpsSeekBar$NpsSeekBarImpl;->getProgress(I)V

    .line 44
    :cond_0
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 49
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 54
    return-void
.end method
