.class Lo/cbq$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/vg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cbq;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cbq;


# direct methods
.method constructor <init>(Lo/cbq;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lo/cbq$5;->c:Lo/cbq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;)V
    .locals 6

    .line 55
    invoke-virtual {p1}, Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;->getActivityRecognitionEvents()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;

    .line 56
    iget-object v0, p0, Lo/cbq$5;->c:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->d(Lo/cbq;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getActivity()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getEventType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    invoke-virtual {v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getActivity()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.activity_recognition.still"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getEventType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 59
    iget-object v0, p0, Lo/cbq$5;->c:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->e(Lo/cbq;)Lo/ccf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/ccf;->d(I)V

    goto/16 :goto_1

    .line 60
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getActivity()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.activity_recognition.still"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getEventType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 61
    iget-object v0, p0, Lo/cbq$5;->c:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->e(Lo/cbq;)Lo/ccf;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/ccf;->d(I)V

    goto/16 :goto_1

    .line 62
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getActivity()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.activity_recognition.walking"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getEventType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 63
    iget-object v0, p0, Lo/cbq$5;->c:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->e(Lo/cbq;)Lo/ccf;

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lo/ccf;->d(I)V

    goto :goto_1

    .line 64
    :cond_2
    invoke-virtual {v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getActivity()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.activity_recognition.running"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getEventType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 65
    iget-object v0, p0, Lo/cbq$5;->c:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->e(Lo/cbq;)Lo/ccf;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Lo/ccf;->d(I)V

    goto :goto_1

    .line 66
    :cond_3
    invoke-virtual {v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getActivity()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.activity_recognition.on_bicycle"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getEventType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 67
    iget-object v0, p0, Lo/cbq$5;->c:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->e(Lo/cbq;)Lo/ccf;

    move-result-object v0

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Lo/ccf;->d(I)V

    goto :goto_1

    .line 68
    :cond_4
    invoke-virtual {v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getActivity()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.activity_recognition.in_vehicle"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getEventType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 69
    iget-object v0, p0, Lo/cbq$5;->c:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->e(Lo/cbq;)Lo/ccf;

    move-result-object v0

    const/4 v1, 0x5

    invoke-interface {v0, v1}, Lo/ccf;->d(I)V

    .line 72
    :cond_5
    :goto_1
    goto/16 :goto_0

    .line 73
    :cond_6
    return-void
.end method

.method public a(Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;)V
    .locals 6

    .line 77
    invoke-virtual {p1}, Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;->getActivityRecognitionExtendEvents()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;

    .line 78
    iget-object v0, p0, Lo/cbq$5;->c:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->d(Lo/cbq;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->getActivity()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->getEventType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    iget-object v0, p0, Lo/cbq$5;->c:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->d(Lo/cbq;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityExtendChanged "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/cbq$5;->c:Lo/cbq;

    invoke-static {v3}, Lo/cbq;->c(Lo/cbq;)Lo/ve;

    move-result-object v3

    invoke-virtual {v3}, Lo/ve;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    goto :goto_0

    .line 81
    :cond_0
    return-void
.end method

.method public a(Lcom/huawei/android/location/activityrecognition/HwEnvironmentChangedEvent;)V
    .locals 6

    .line 85
    invoke-virtual {p1}, Lcom/huawei/android/location/activityrecognition/HwEnvironmentChangedEvent;->getEnvironmentRecognitionEvents()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;

    .line 86
    iget-object v0, p0, Lo/cbq$5;->c:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->d(Lo/cbq;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->getActivity()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->getEventType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    goto :goto_0

    .line 88
    :cond_0
    iget-object v0, p0, Lo/cbq$5;->c:Lo/cbq;

    invoke-static {v0}, Lo/cbq;->d(Lo/cbq;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onEnvironmentChanged "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/cbq$5;->c:Lo/cbq;

    invoke-static {v3}, Lo/cbq;->c(Lo/cbq;)Lo/ve;

    move-result-object v3

    invoke-virtual {v3}, Lo/ve;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    return-void
.end method
