.class public Lo/cbq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:Ljava/lang/String;

.field private c:J

.field private d:Lo/ccf;

.field private e:Lo/ve;


# direct methods
.method public constructor <init>(Lo/ccf;)V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbq;->e:Lo/ve;

    .line 26
    const-string v0, "Track_ARMotionDetector"

    iput-object v0, p0, Lo/cbq;->b:Ljava/lang/String;

    .line 27
    const-wide/32 v0, 0x77359400

    iput-wide v0, p0, Lo/cbq;->a:J

    .line 28
    const-wide v0, 0x2540be400L

    iput-wide v0, p0, Lo/cbq;->c:J

    .line 34
    iput-object p1, p0, Lo/cbq;->d:Lo/ccf;

    .line 35
    return-void
.end method

.method static synthetic a(Lo/cbq;)J
    .locals 2

    .line 23
    iget-wide v0, p0, Lo/cbq;->a:J

    return-wide v0
.end method

.method static synthetic b(Lo/cbq;)J
    .locals 2

    .line 23
    iget-wide v0, p0, Lo/cbq;->c:J

    return-wide v0
.end method

.method static synthetic c(Lo/cbq;)Lo/ve;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/cbq;->e:Lo/ve;

    return-object v0
.end method

.method static synthetic d(Lo/cbq;)Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/cbq;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lo/cbq;)Lo/ccf;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/cbq;->d:Lo/ccf;

    return-object v0
.end method

.method private e()V
    .locals 5

    .line 50
    :try_start_0
    iget-object v0, p0, Lo/cbq;->e:Lo/ve;

    new-instance v1, Lo/cbq$5;

    invoke-direct {v1, p0}, Lo/cbq$5;-><init>(Lo/cbq;)V

    new-instance v2, Lo/cbq$2;

    invoke-direct {v2, p0}, Lo/cbq$2;-><init>(Lo/cbq;)V

    invoke-virtual {v0, v1, v2}, Lo/ve;->e(Lo/vg;Lo/vm;)Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 125
    goto :goto_0

    .line 121
    :catch_0
    move-exception v4

    .line 122
    iget-object v0, p0, Lo/cbq;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connectARModule "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    goto :goto_0

    .line 123
    :catch_1
    move-exception v4

    .line 124
    iget-object v0, p0, Lo/cbq;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connectARModule "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    :goto_0
    return-void
.end method

.method private i()V
    .locals 5

    .line 132
    iget-object v0, p0, Lo/cbq;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "disconnectWithARModule "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    :try_start_0
    iget-object v0, p0, Lo/cbq;->e:Lo/ve;

    if-nez v0, :cond_0

    .line 135
    iget-object v0, p0, Lo/cbq;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stillActivityRecognition is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 136
    return-void

    .line 139
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/cbq;->e:Lo/ve;

    const-string v1, "android.activity_recognition.still"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/ve;->b(Ljava/lang/String;I)Z

    .line 140
    iget-object v0, p0, Lo/cbq;->e:Lo/ve;

    const-string v1, "android.activity_recognition.still"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lo/ve;->b(Ljava/lang/String;I)Z

    .line 141
    iget-object v0, p0, Lo/cbq;->e:Lo/ve;

    const-string v1, "android.activity_recognition.walking"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/ve;->b(Ljava/lang/String;I)Z

    .line 142
    iget-object v0, p0, Lo/cbq;->e:Lo/ve;

    const-string v1, "android.activity_recognition.running"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/ve;->b(Ljava/lang/String;I)Z

    .line 143
    iget-object v0, p0, Lo/cbq;->e:Lo/ve;

    const-string v1, "android.activity_recognition.on_bicycle"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/ve;->b(Ljava/lang/String;I)Z

    .line 144
    iget-object v0, p0, Lo/cbq;->e:Lo/ve;

    const-string v1, "android.activity_recognition.in_vehicle"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/ve;->b(Ljava/lang/String;I)Z

    .line 145
    iget-object v0, p0, Lo/cbq;->e:Lo/ve;

    const-string v1, "android.activity_recognition.walking"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lo/ve;->b(Ljava/lang/String;I)Z

    .line 146
    iget-object v0, p0, Lo/cbq;->e:Lo/ve;

    const-string v1, "android.activity_recognition.running"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lo/ve;->b(Ljava/lang/String;I)Z

    .line 147
    iget-object v0, p0, Lo/cbq;->e:Lo/ve;

    const-string v1, "android.activity_recognition.on_bicycle"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lo/ve;->b(Ljava/lang/String;I)Z

    .line 148
    iget-object v0, p0, Lo/cbq;->e:Lo/ve;

    const-string v1, "android.activity_recognition.in_vehicle"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lo/ve;->b(Ljava/lang/String;I)Z

    .line 150
    iget-object v0, p0, Lo/cbq;->e:Lo/ve;

    invoke-virtual {v0}, Lo/ve;->b()Z
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 155
    goto :goto_0

    .line 151
    :catch_0
    move-exception v4

    .line 152
    iget-object v0, p0, Lo/cbq;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "disconnectWithARModule "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    goto :goto_0

    .line 153
    :catch_1
    move-exception v4

    .line 154
    iget-object v0, p0, Lo/cbq;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "disconnectWithARModule "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    :goto_0
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 9

    .line 166
    const-string v2, "unkwon"

    .line 167
    iget-object v0, p0, Lo/cbq;->e:Lo/ve;

    if-eqz v0, :cond_4

    .line 168
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    .line 169
    iget-object v0, p0, Lo/cbq;->e:Lo/ve;

    invoke-virtual {v0}, Lo/ve;->c()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    .line 171
    :cond_0
    iget-object v0, p0, Lo/cbq;->e:Lo/ve;

    invoke-virtual {v0}, Lo/ve;->e()Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;

    move-result-object v3

    .line 172
    if-eqz v3, :cond_4

    .line 173
    const-wide/16 v4, 0x0

    .line 174
    const-string v6, ""

    .line 175
    invoke-virtual {v3}, Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;->getActivityRecognitionExtendEvents()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;

    .line 176
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-nez v0, :cond_1

    .line 177
    invoke-virtual {v8}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->getTimestampNs()J

    move-result-wide v4

    .line 178
    invoke-virtual {v8}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->getActivity()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    .line 180
    :cond_1
    invoke-virtual {v8}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->getTimestampNs()J

    move-result-wide v0

    cmp-long v0, v4, v0

    if-lez v0, :cond_2

    .line 181
    invoke-virtual {v8}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->getTimestampNs()J

    move-result-wide v4

    .line 182
    invoke-virtual {v8}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->getActivity()Ljava/lang/String;

    move-result-object v6

    .line 185
    :cond_2
    :goto_1
    goto :goto_0

    .line 187
    :cond_3
    move-object v2, v6

    .line 192
    :cond_4
    :goto_2
    return-object v2
.end method

.method public b()Z
    .locals 8

    .line 196
    const-string v4, "unkwon"

    .line 197
    iget-object v0, p0, Lo/cbq;->e:Lo/ve;

    if-eqz v0, :cond_3

    .line 198
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_1

    .line 199
    const-string v0, "android.activity_recognition.still"

    iget-object v1, p0, Lo/cbq;->e:Lo/ve;

    invoke-virtual {v1}, Lo/ve;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 200
    iget-object v0, p0, Lo/cbq;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "curState is android.activity_recognition.still"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    const/4 v0, 0x1

    return v0

    .line 203
    :cond_0
    iget-object v0, p0, Lo/cbq;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "curState is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/cbq;->e:Lo/ve;

    invoke-virtual {v3}, Lo/ve;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 205
    :cond_1
    iget-object v0, p0, Lo/cbq;->e:Lo/ve;

    invoke-virtual {v0}, Lo/ve;->e()Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;

    move-result-object v5

    .line 206
    if-eqz v5, :cond_3

    .line 207
    invoke-virtual {v5}, Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;->getActivityRecognitionExtendEvents()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;

    .line 208
    const-string v0, "android.activity_recognition.still"

    invoke-virtual {v7}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->getActivity()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 209
    iget-object v0, p0, Lo/cbq;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "curState is android.activity_recognition.still"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    const/4 v0, 0x1

    return v0

    .line 212
    :cond_2
    iget-object v0, p0, Lo/cbq;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "curState is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->getActivity()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    goto :goto_0

    .line 217
    :cond_3
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public c()V
    .locals 4

    .line 38
    new-instance v0, Lo/ve;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ve;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/cbq;->e:Lo/ve;

    .line 39
    invoke-direct {p0}, Lo/cbq;->e()V

    .line 40
    iget-object v0, p0, Lo/cbq;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ARMotionDetector is start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    return-void
.end method

.method public d()V
    .locals 0

    .line 45
    invoke-direct {p0}, Lo/cbq;->i()V

    .line 46
    return-void
.end method
