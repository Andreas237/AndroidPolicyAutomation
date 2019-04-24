.class public Lo/ve;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ve$a;,
        Lo/ve$d;
    }
.end annotation


# static fields
.field private static final h:I


# instance fields
.field private a:Lo/vm;

.field private b:Landroid/content/Context;

.field private c:Lo/vi;

.field private d:Lo/vk;

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Lo/ve$d;

.field private i:Lo/eep;

.field private k:Lo/eet;

.field private l:Landroid/content/ServiceConnection;

.field private p:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 77
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sput v0, Lo/ve;->h:I

    .line 78
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lo/ve;->e:I

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ve;->b:Landroid/content/Context;

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ve;->a:Lo/vm;

    .line 69
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ve;->d:Lo/vk;

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ve;->i:Lo/eep;

    .line 1017
    new-instance v0, Lo/ve$3;

    invoke-direct {v0, p0}, Lo/ve$3;-><init>(Lo/ve;)V

    iput-object v0, p0, Lo/ve;->p:Landroid/os/Handler;

    .line 1042
    new-instance v0, Lo/ve$5;

    invoke-direct {v0, p0}, Lo/ve$5;-><init>(Lo/ve;)V

    iput-object v0, p0, Lo/ve;->l:Landroid/content/ServiceConnection;

    .line 81
    const-string v0, "ARMoudle.HwActivityRecognition"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "HwActivityRecognition, android version:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v2, Lo/ve;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    if-eqz p1, :cond_0

    .line 83
    iput-object p1, p0, Lo/ve;->b:Landroid/content/Context;

    .line 84
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ve;->f:Ljava/lang/String;

    .line 85
    new-instance v0, Lo/ve$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/ve$d;-><init>(Lo/ve;Lo/ve$d;)V

    iput-object v0, p0, Lo/ve;->g:Lo/ve$d;

    .line 87
    :cond_0
    return-void
.end method

.method static synthetic a()I
    .locals 1

    .line 77
    sget v0, Lo/ve;->h:I

    return v0
.end method

.method static synthetic a(Lo/ve;Lcom/huawei/systemserver/activityrecognition/HwActivityChangedExtendEvent;)Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;
    .locals 1

    .line 906
    invoke-direct {p0, p1}, Lo/ve;->e(Lcom/huawei/systemserver/activityrecognition/HwActivityChangedExtendEvent;)Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lo/ve;Lcom/huawei/systemserver/activityrecognition/HwEnvironmentChangedEvent;)Lcom/huawei/android/location/activityrecognition/HwEnvironmentChangedEvent;
    .locals 1

    .line 933
    invoke-direct {p0, p1}, Lo/ve;->d(Lcom/huawei/systemserver/activityrecognition/HwEnvironmentChangedEvent;)Lcom/huawei/android/location/activityrecognition/HwEnvironmentChangedEvent;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/huawei/systemserver/activityrecognition/OtherParameters;)Lcom/huawei/android/location/activityrecognition/OtherParameters;
    .locals 11

    .line 962
    if-nez p1, :cond_0

    .line 963
    const/4 v0, 0x0

    return-object v0

    .line 965
    :cond_0
    new-instance v0, Lcom/huawei/android/location/activityrecognition/OtherParameters;

    invoke-virtual {p1}, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->getmParam1()D

    move-result-wide v1

    .line 966
    invoke-virtual {p1}, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->getmParam2()D

    move-result-wide v3

    invoke-virtual {p1}, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->getmParam3()D

    move-result-wide v5

    .line 967
    invoke-virtual {p1}, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->getmParam4()D

    move-result-wide v7

    invoke-virtual {p1}, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->getmParam5()Ljava/lang/String;

    move-result-object v9

    .line 965
    invoke-direct/range {v0 .. v9}, Lcom/huawei/android/location/activityrecognition/OtherParameters;-><init>(DDDDLjava/lang/String;)V

    move-object v10, v0

    .line 968
    return-object v10
.end method

.method private a(Lo/vg;)Lo/eet;
    .locals 1

    .line 973
    if-nez p1, :cond_0

    .line 974
    const/4 v0, 0x0

    return-object v0

    .line 976
    :cond_0
    new-instance v0, Lo/ve$1;

    invoke-direct {v0, p0, p1}, Lo/ve$1;-><init>(Lo/ve;Lo/vg;)V

    return-object v0
.end method

.method static synthetic a(Lo/ve;)V
    .locals 0

    .line 1076
    invoke-direct {p0}, Lo/ve;->o()V

    return-void
.end method

.method static synthetic b(Lo/ve;Lcom/huawei/systemserver/activityrecognition/HwActivityChangedEvent;)Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;
    .locals 1

    .line 880
    invoke-direct {p0, p1}, Lo/ve;->d(Lcom/huawei/systemserver/activityrecognition/HwActivityChangedEvent;)Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lo/ve;)V
    .locals 0

    .line 1111
    invoke-direct {p0}, Lo/ve;->p()V

    return-void
.end method

.method static synthetic c(Lo/ve;)V
    .locals 0

    .line 1002
    invoke-direct {p0}, Lo/ve;->l()V

    return-void
.end method

.method private c(Ljava/lang/String;I)Z
    .locals 5

    .line 497
    const/4 v3, 0x0

    .line 498
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "disableActivityEvent"

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 499
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 500
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "activity is null."

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 501
    return v3

    .line 504
    :cond_0
    const-string v0, "ARMoudle.HwActivityRecognition"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    iget-object v0, p0, Lo/ve;->d:Lo/vk;

    if-nez v0, :cond_1

    .line 506
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "mService is null."

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    return v3

    .line 511
    :cond_1
    :try_start_0
    iget-object v0, p0, Lo/ve;->d:Lo/vk;

    invoke-interface {v0, p1, p2}, Lo/vk;->c(Ljava/lang/String;I)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 512
    goto :goto_0

    :catch_0
    move-exception v4

    .line 513
    const-string v0, "ARMoudle.HwActivityRecognition"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "disableActivityEvent error:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 516
    :goto_0
    return v3
.end method

.method static synthetic d(Lo/ve;)Landroid/os/Handler;
    .locals 1

    .line 1017
    iget-object v0, p0, Lo/ve;->p:Landroid/os/Handler;

    return-object v0
.end method

.method private d(Lcom/huawei/systemserver/activityrecognition/HwActivityChangedEvent;)Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;
    .locals 10

    .line 882
    if-nez p1, :cond_0

    .line 883
    const/4 v0, 0x0

    return-object v0

    .line 886
    :cond_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 887
    .line 888
    invoke-virtual {p1}, Lcom/huawei/systemserver/activityrecognition/HwActivityChangedEvent;->getActivityRecognitionEvents()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    goto :goto_0

    :cond_1
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent;

    .line 889
    new-instance v0, Lo/ve$a;

    invoke-virtual {v7}, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent;->getActivity()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent;->getEventType()I

    move-result v2

    .line 890
    invoke-virtual {v7}, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent;->getTimestampNs()J

    move-result-wide v3

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/ve$a;-><init>(Ljava/lang/String;IJLcom/huawei/android/location/activityrecognition/OtherParameters;)V

    .line 889
    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 887
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 892
    .line 893
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    .line 892
    new-array v7, v0, [Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;

    .line 894
    const/4 v8, 0x0

    .line 895
    const/4 v9, 0x0

    goto :goto_1

    .line 896
    :cond_2
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/ve$a;

    .line 897
    new-instance v0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;

    .line 898
    invoke-virtual {v8}, Lo/ve$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8}, Lo/ve$a;->c()I

    move-result v2

    .line 899
    invoke-virtual {v8}, Lo/ve$a;->d()J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;-><init>(Ljava/lang/String;IJ)V

    .line 897
    aput-object v0, v7, v9

    .line 895
    add-int/lit8 v9, v9, 0x1

    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lt v9, v0, :cond_2

    .line 901
    new-instance v9, Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;

    .line 901
    .line 902
    invoke-direct {v9, v7}, Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;-><init>([Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;)V

    .line 903
    return-object v9
.end method

.method private d(Lcom/huawei/systemserver/activityrecognition/HwEnvironmentChangedEvent;)Lcom/huawei/android/location/activityrecognition/HwEnvironmentChangedEvent;
    .locals 10

    .line 935
    if-nez p1, :cond_0

    .line 936
    const/4 v0, 0x0

    return-object v0

    .line 939
    :cond_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 940
    .line 941
    invoke-virtual {p1}, Lcom/huawei/systemserver/activityrecognition/HwEnvironmentChangedEvent;->getEnvironmentRecognitionEvents()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    goto :goto_0

    :cond_1
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionExtendEvent;

    .line 942
    new-instance v0, Lo/ve$a;

    invoke-virtual {v7}, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionExtendEvent;->getActivity()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionExtendEvent;->getEventType()I

    move-result v2

    .line 943
    invoke-virtual {v7}, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionExtendEvent;->getTimestampNs()J

    move-result-wide v3

    .line 944
    invoke-virtual {v7}, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionExtendEvent;->getOtherParams()Lcom/huawei/systemserver/activityrecognition/OtherParameters;

    move-result-object v5

    .line 943
    invoke-direct {p0, v5}, Lo/ve;->a(Lcom/huawei/systemserver/activityrecognition/OtherParameters;)Lcom/huawei/android/location/activityrecognition/OtherParameters;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lo/ve$a;-><init>(Ljava/lang/String;IJLcom/huawei/android/location/activityrecognition/OtherParameters;)V

    .line 942
    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 940
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 946
    .line 947
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    .line 946
    new-array v7, v0, [Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;

    .line 948
    const/4 v8, 0x0

    .line 949
    const/4 v9, 0x0

    goto :goto_1

    .line 950
    :cond_2
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/ve$a;

    .line 951
    new-instance v0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;

    .line 952
    invoke-virtual {v8}, Lo/ve$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8}, Lo/ve$a;->c()I

    move-result v2

    .line 953
    invoke-virtual {v8}, Lo/ve$a;->d()J

    move-result-wide v3

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;-><init>(Ljava/lang/String;IJLcom/huawei/android/location/activityrecognition/OtherParameters;)V

    .line 951
    aput-object v0, v7, v9

    .line 949
    add-int/lit8 v9, v9, 0x1

    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lt v9, v0, :cond_2

    .line 955
    new-instance v9, Lcom/huawei/android/location/activityrecognition/HwEnvironmentChangedEvent;

    .line 955
    .line 956
    invoke-direct {v9, v7}, Lcom/huawei/android/location/activityrecognition/HwEnvironmentChangedEvent;-><init>([Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;)V

    .line 957
    return-object v9
.end method

.method private d(Lo/vg;)Lo/vi;
    .locals 1

    .line 834
    if-nez p1, :cond_0

    .line 835
    const/4 v0, 0x0

    return-object v0

    .line 837
    :cond_0
    new-instance v0, Lo/ve$4;

    invoke-direct {v0, p0, p1}, Lo/ve$4;-><init>(Lo/ve;Lo/vg;)V

    return-object v0
.end method

.method static synthetic d(Lo/ve;Lo/eep;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lo/ve;->i:Lo/eep;

    return-void
.end method

.method private d()Z
    .locals 2

    .line 176
    sget v0, Lo/ve;->h:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    .line 177
    invoke-direct {p0}, Lo/ve;->g()Z

    move-result v0

    return v0

    .line 179
    :cond_0
    invoke-direct {p0}, Lo/ve;->h()Z

    move-result v0

    return v0
.end method

.method private d(Ljava/lang/String;I)Z
    .locals 5

    .line 520
    const/4 v3, 0x0

    .line 521
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "disableActivityEvent"

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 522
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 523
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "activity is null."

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 524
    return v3

    .line 527
    :cond_0
    const-string v0, "ARMoudle.HwActivityRecognition"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 528
    iget-object v0, p0, Lo/ve;->i:Lo/eep;

    if-nez v0, :cond_1

    .line 529
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "mService is null."

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 530
    return v3

    .line 534
    :cond_1
    :try_start_0
    iget-object v0, p0, Lo/ve;->i:Lo/eep;

    iget-object v1, p0, Lo/ve;->f:Ljava/lang/String;

    .line 534
    .line 535
    invoke-interface {v0, v1, p1, p2}, Lo/eep;->d(Ljava/lang/String;Ljava/lang/String;I)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 536
    goto :goto_0

    :catch_0
    move-exception v4

    .line 537
    const-string v0, "ARMoudle.HwActivityRecognition"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "disableActivityEvent error:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 540
    :goto_0
    return v3
.end method

.method private e(Lcom/huawei/systemserver/activityrecognition/HwActivityChangedExtendEvent;)Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;
    .locals 10

    .line 908
    if-nez p1, :cond_0

    .line 909
    const/4 v0, 0x0

    return-object v0

    .line 912
    :cond_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 913
    .line 914
    invoke-virtual {p1}, Lcom/huawei/systemserver/activityrecognition/HwActivityChangedExtendEvent;->getActivityRecognitionExtendEvents()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    goto :goto_0

    :cond_1
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionExtendEvent;

    .line 915
    new-instance v0, Lo/ve$a;

    invoke-virtual {v7}, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionExtendEvent;->getActivity()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionExtendEvent;->getEventType()I

    move-result v2

    .line 916
    invoke-virtual {v7}, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionExtendEvent;->getTimestampNs()J

    move-result-wide v3

    .line 917
    invoke-virtual {v7}, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionExtendEvent;->getOtherParams()Lcom/huawei/systemserver/activityrecognition/OtherParameters;

    move-result-object v5

    .line 916
    invoke-direct {p0, v5}, Lo/ve;->a(Lcom/huawei/systemserver/activityrecognition/OtherParameters;)Lcom/huawei/android/location/activityrecognition/OtherParameters;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lo/ve$a;-><init>(Ljava/lang/String;IJLcom/huawei/android/location/activityrecognition/OtherParameters;)V

    .line 915
    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 913
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 919
    .line 920
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    .line 919
    new-array v7, v0, [Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;

    .line 921
    const/4 v8, 0x0

    .line 922
    const/4 v9, 0x0

    goto :goto_1

    .line 923
    :cond_2
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/ve$a;

    .line 924
    new-instance v0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;

    .line 925
    invoke-virtual {v8}, Lo/ve$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8}, Lo/ve$a;->c()I

    move-result v2

    .line 926
    invoke-virtual {v8}, Lo/ve$a;->d()J

    move-result-wide v3

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;-><init>(Ljava/lang/String;IJLcom/huawei/android/location/activityrecognition/OtherParameters;)V

    .line 924
    aput-object v0, v7, v9

    .line 922
    add-int/lit8 v9, v9, 0x1

    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lt v9, v0, :cond_2

    .line 928
    new-instance v9, Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;

    .line 928
    .line 929
    invoke-direct {v9, v7}, Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;-><init>([Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;)V

    .line 930
    return-object v9
.end method

.method static synthetic e(Lo/ve;Lo/vk;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lo/ve;->d:Lo/vk;

    return-void
.end method

.method static synthetic e(Lo/ve;)Z
    .locals 1

    .line 175
    invoke-direct {p0}, Lo/ve;->d()Z

    move-result v0

    return v0
.end method

.method static synthetic f(Lo/ve;)Lo/eep;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/ve;->i:Lo/eep;

    return-object v0
.end method

.method private f()Z
    .locals 5

    .line 240
    const/4 v3, 0x0

    .line 241
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "unregisterSink_O"

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    iget-object v0, p0, Lo/ve;->i:Lo/eep;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ve;->k:Lo/eet;

    if-nez v0, :cond_1

    .line 243
    :cond_0
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "mService_O or mService_O is null."

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    return v3

    .line 247
    :cond_1
    :try_start_0
    iget-object v0, p0, Lo/ve;->i:Lo/eep;

    iget-object v1, p0, Lo/ve;->f:Ljava/lang/String;

    iget-object v2, p0, Lo/ve;->k:Lo/eet;

    invoke-interface {v0, v1, v2}, Lo/eep;->a(Ljava/lang/String;Lo/eet;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 248
    goto :goto_0

    :catch_0
    move-exception v4

    .line 249
    const-string v0, "ARMoudle.HwActivityRecognition"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unregisterSink error:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    :goto_0
    return v3
.end method

.method static synthetic g(Lo/ve;)Lo/vm;
    .locals 1

    .line 68
    iget-object v0, p0, Lo/ve;->a:Lo/vm;

    return-object v0
.end method

.method private g()Z
    .locals 5

    .line 199
    const/4 v3, 0x0

    .line 200
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "registerSink_O"

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    iget-object v0, p0, Lo/ve;->i:Lo/eep;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ve;->k:Lo/eet;

    if-nez v0, :cond_1

    .line 202
    :cond_0
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "mService_O or mSink_O is null."

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    return v3

    .line 206
    :cond_1
    :try_start_0
    iget-object v0, p0, Lo/ve;->i:Lo/eep;

    iget-object v1, p0, Lo/ve;->f:Ljava/lang/String;

    iget-object v2, p0, Lo/ve;->k:Lo/eet;

    invoke-interface {v0, v1, v2}, Lo/eep;->d(Ljava/lang/String;Lo/eet;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 207
    goto :goto_0

    :catch_0
    move-exception v4

    .line 208
    const-string v0, "ARMoudle.HwActivityRecognition"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "registerSink error:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    :goto_0
    return v3
.end method

.method private h()Z
    .locals 5

    .line 184
    const/4 v3, 0x0

    .line 185
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "registerSink_N"

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    iget-object v0, p0, Lo/ve;->d:Lo/vk;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ve;->c:Lo/vi;

    if-nez v0, :cond_1

    .line 187
    :cond_0
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "mService or mSink is null."

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    return v3

    .line 191
    :cond_1
    :try_start_0
    iget-object v0, p0, Lo/ve;->d:Lo/vk;

    iget-object v1, p0, Lo/ve;->c:Lo/vi;

    invoke-interface {v0, v1}, Lo/vk;->c(Lo/vi;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 192
    goto :goto_0

    :catch_0
    move-exception v4

    .line 193
    const-string v0, "ARMoudle.HwActivityRecognition"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "registerSink error:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    :goto_0
    return v3
.end method

.method static synthetic i(Lo/ve;)Lo/ve$d;
    .locals 1

    .line 73
    iget-object v0, p0, Lo/ve;->g:Lo/ve$d;

    return-object v0
.end method

.method private i()Z
    .locals 5

    .line 225
    const/4 v3, 0x0

    .line 226
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "unregisterSink_N"

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    iget-object v0, p0, Lo/ve;->d:Lo/vk;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ve;->c:Lo/vi;

    if-nez v0, :cond_1

    .line 228
    :cond_0
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "mService or mSink is null."

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    return v3

    .line 232
    :cond_1
    :try_start_0
    iget-object v0, p0, Lo/ve;->d:Lo/vk;

    iget-object v1, p0, Lo/ve;->c:Lo/vi;

    invoke-interface {v0, v1}, Lo/vk;->e(Lo/vi;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 233
    goto :goto_0

    :catch_0
    move-exception v4

    .line 234
    const-string v0, "ARMoudle.HwActivityRecognition"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unregisterSink error:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    :goto_0
    return v3
.end method

.method static synthetic k(Lo/ve;)Lo/vk;
    .locals 1

    .line 69
    iget-object v0, p0, Lo/ve;->d:Lo/vk;

    return-object v0
.end method

.method private k()Z
    .locals 2

    .line 217
    sget v0, Lo/ve;->h:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    .line 218
    invoke-direct {p0}, Lo/ve;->f()Z

    move-result v0

    return v0

    .line 220
    :cond_0
    invoke-direct {p0}, Lo/ve;->i()Z

    move-result v0

    return v0
.end method

.method private l()V
    .locals 5

    .line 1004
    :try_start_0
    iget-object v0, p0, Lo/ve;->d:Lo/vk;

    if-eqz v0, :cond_1

    .line 1005
    iget-object v0, p0, Lo/ve;->d:Lo/vk;

    invoke-interface {v0}, Lo/vk;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1006
    iget-object v0, p0, Lo/ve;->p:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1007
    iget-object v0, p0, Lo/ve;->a:Lo/vm;

    invoke-interface {v0}, Lo/vm;->c()V

    .line 1008
    goto :goto_0

    .line 1009
    :cond_0
    iget-object v0, p0, Lo/ve;->p:Landroid/os/Handler;

    const/4 v1, 0x0

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1012
    goto :goto_0

    :catch_0
    move-exception v4

    .line 1013
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "providerLoadOk fail"

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1015
    :cond_1
    :goto_0
    return-void
.end method

.method private o()V
    .locals 5

    .line 1077
    iget v0, p0, Lo/ve;->e:I

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    .line 1078
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "try connect 10 times, connection fail"

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1079
    return-void

    .line 1082
    :cond_0
    sget v0, Lo/ve;->h:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_1

    .line 1083
    iget-object v0, p0, Lo/ve;->i:Lo/eep;

    if-nez v0, :cond_2

    .line 1084
    const-string v0, "ARMoudle.HwActivityRecognition"

    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Lo/ve;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, " bind ar service."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1085
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 1086
    const-string v0, "com.huawei.systemserver"

    .line 1087
    const-string v1, "com.huawei.systemserver.activityrecognition.ActivityRecognitionService"

    .line 1086
    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1088
    iget-object v0, p0, Lo/ve;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/ve;->l:Landroid/content/ServiceConnection;

    .line 1088
    .line 1089
    const/4 v2, 0x1

    invoke-virtual {v0, v4, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 1090
    iget v0, p0, Lo/ve;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ve;->e:I

    .line 1091
    iget-object v0, p0, Lo/ve;->p:Landroid/os/Handler;

    const/4 v1, 0x1

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1093
    goto :goto_0

    .line 1094
    :cond_1
    iget-object v0, p0, Lo/ve;->d:Lo/vk;

    if-nez v0, :cond_2

    .line 1095
    const-string v0, "ARMoudle.HwActivityRecognition"

    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Lo/ve;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, " bind ar service."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1096
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 1097
    const-string v0, "com.huawei.android.location.activityrecognition"

    .line 1098
    const-string v1, "com.huawei.android.location.activityrecognition.ActivityRecognitionService"

    .line 1097
    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1099
    iget-object v0, p0, Lo/ve;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/ve;->l:Landroid/content/ServiceConnection;

    .line 1099
    .line 1100
    const/4 v2, 0x1

    invoke-virtual {v0, v4, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 1101
    iget v0, p0, Lo/ve;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ve;->e:I

    .line 1102
    iget-object v0, p0, Lo/ve;->p:Landroid/os/Handler;

    const/4 v1, 0x1

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1106
    :cond_2
    :goto_0
    return-void
.end method

.method private p()V
    .locals 4

    .line 1113
    :try_start_0
    sget v0, Lo/ve;->h:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    .line 1114
    iget-object v0, p0, Lo/ve;->i:Lo/eep;

    if-eqz v0, :cond_1

    .line 1115
    iget-object v0, p0, Lo/ve;->i:Lo/eep;

    invoke-interface {v0}, Lo/eep;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object v1, p0, Lo/ve;->g:Lo/ve$d;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    .line 1117
    goto :goto_0

    .line 1118
    :cond_0
    iget-object v0, p0, Lo/ve;->d:Lo/vk;

    if-eqz v0, :cond_1

    .line 1119
    iget-object v0, p0, Lo/ve;->d:Lo/vk;

    invoke-interface {v0}, Lo/vk;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object v1, p0, Lo/ve;->g:Lo/ve$d;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1122
    goto :goto_0

    :catch_0
    move-exception v3

    .line 1123
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "IBinder register linkToDeath function fail."

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1125
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public b()Z
    .locals 3

    .line 140
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "disconnectService"

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    sget v0, Lo/ve;->h:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_1

    .line 142
    iget-object v0, p0, Lo/ve;->i:Lo/eep;

    if-nez v0, :cond_0

    .line 143
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "mService_O is null."

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    const/4 v0, 0x0

    return v0

    .line 146
    :cond_0
    iget-object v0, p0, Lo/ve;->i:Lo/eep;

    invoke-interface {v0}, Lo/eep;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object v1, p0, Lo/ve;->g:Lo/ve$d;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 148
    goto :goto_0

    .line 149
    :cond_1
    iget-object v0, p0, Lo/ve;->d:Lo/vk;

    if-nez v0, :cond_2

    .line 150
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "mService is null."

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    const/4 v0, 0x0

    return v0

    .line 153
    :cond_2
    iget-object v0, p0, Lo/ve;->d:Lo/vk;

    invoke-interface {v0}, Lo/vk;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object v1, p0, Lo/ve;->g:Lo/ve$d;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 157
    :goto_0
    invoke-direct {p0}, Lo/ve;->k()Z

    .line 158
    iget-object v0, p0, Lo/ve;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/ve;->l:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 159
    iget-object v0, p0, Lo/ve;->a:Lo/vm;

    invoke-interface {v0}, Lo/vm;->d()V

    .line 160
    sget v0, Lo/ve;->h:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_3

    .line 161
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ve;->i:Lo/eep;

    .line 162
    goto :goto_1

    .line 163
    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ve;->d:Lo/vk;

    .line 166
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ve;->e:I

    .line 167
    iget-object v0, p0, Lo/ve;->p:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 168
    iget-object v0, p0, Lo/ve;->p:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 169
    const/4 v0, 0x1

    return v0
.end method

.method public b(Ljava/lang/String;I)Z
    .locals 2

    .line 489
    sget v0, Lo/ve;->h:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    .line 490
    invoke-direct {p0, p1, p2}, Lo/ve;->d(Ljava/lang/String;I)Z

    move-result v0

    return v0

    .line 492
    :cond_0
    invoke-direct {p0, p1, p2}, Lo/ve;->c(Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 5

    .line 544
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "getCurrentActivity"

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 545
    const-string v3, "unknown"

    .line 547
    iget-object v0, p0, Lo/ve;->d:Lo/vk;

    if-nez v0, :cond_0

    .line 548
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "mService is null."

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 549
    return-object v3

    .line 553
    :cond_0
    :try_start_0
    iget-object v0, p0, Lo/ve;->d:Lo/vk;

    invoke-interface {v0}, Lo/vk;->a()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 554
    goto :goto_0

    :catch_0
    move-exception v4

    .line 555
    const-string v0, "ARMoudle.HwActivityRecognition"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "getCurrentActivity error:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 558
    :goto_0
    return-object v3
.end method

.method public c(Ljava/lang/String;IJ)Z
    .locals 8

    .line 395
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "enableActivityEvent"

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 396
    const/4 v6, 0x0

    .line 397
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, p3, v0

    if-gez v0, :cond_1

    .line 398
    :cond_0
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "activity is null or reportLatencyNs < 0"

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    return v6

    .line 401
    :cond_1
    const-string v0, "ARMoudle.HwActivityRecognition"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 402
    iget-object v0, p0, Lo/ve;->i:Lo/eep;

    if-nez v0, :cond_2

    .line 403
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "mService is null."

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    return v6

    .line 408
    :cond_2
    :try_start_0
    iget-object v0, p0, Lo/ve;->i:Lo/eep;

    iget-object v1, p0, Lo/ve;->f:Ljava/lang/String;

    move-object v2, p1

    .line 409
    move v3, p2

    move-wide v4, p3

    .line 408
    invoke-interface/range {v0 .. v5}, Lo/eep;->b(Ljava/lang/String;Ljava/lang/String;IJ)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v6, v0

    .line 410
    goto :goto_0

    :catch_0
    move-exception v7

    .line 411
    const-string v0, "ARMoudle.HwActivityRecognition"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "enableActivityEvent error:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 414
    :goto_0
    return v6
.end method

.method public d(Ljava/lang/String;IJ)Z
    .locals 2

    .line 363
    sget v0, Lo/ve;->h:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    .line 364
    invoke-virtual {p0, p1, p2, p3, p4}, Lo/ve;->c(Ljava/lang/String;IJ)Z

    move-result v0

    return v0

    .line 366
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lo/ve;->e(Ljava/lang/String;IJ)Z

    move-result v0

    return v0
.end method

.method public e()Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;
    .locals 5

    .line 567
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "getCurrentActivityExtend"

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 568
    iget-object v0, p0, Lo/ve;->i:Lo/eep;

    if-nez v0, :cond_0

    .line 569
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "mService is null."

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 570
    const/4 v0, 0x0

    return-object v0

    .line 573
    :cond_0
    const/4 v3, 0x0

    .line 575
    :try_start_0
    iget-object v0, p0, Lo/ve;->i:Lo/eep;

    invoke-interface {v0}, Lo/eep;->b()Lcom/huawei/systemserver/activityrecognition/HwActivityChangedExtendEvent;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 576
    goto :goto_0

    :catch_0
    move-exception v4

    .line 577
    const-string v0, "ARMoudle.HwActivityRecognition"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "getCurrentActivity error:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 579
    :goto_0
    const-string v0, "ARMoudle.HwActivityRecognition"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "hwActivityEvent:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 580
    invoke-direct {p0, v3}, Lo/ve;->e(Lcom/huawei/systemserver/activityrecognition/HwActivityChangedExtendEvent;)Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;IJ)Z
    .locals 5

    .line 372
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "enableActivityEvent"

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 373
    const/4 v3, 0x0

    .line 374
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, p3, v0

    if-gez v0, :cond_1

    .line 375
    :cond_0
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "activity is null or reportLatencyNs < 0"

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 376
    return v3

    .line 378
    :cond_1
    const-string v0, "ARMoudle.HwActivityRecognition"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 379
    iget-object v0, p0, Lo/ve;->d:Lo/vk;

    if-nez v0, :cond_2

    .line 380
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "mService is null."

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    return v3

    .line 385
    :cond_2
    :try_start_0
    iget-object v0, p0, Lo/ve;->d:Lo/vk;

    .line 385
    .line 386
    invoke-interface {v0, p1, p2, p3, p4}, Lo/vk;->b(Ljava/lang/String;IJ)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 387
    goto :goto_0

    :catch_0
    move-exception v4

    .line 388
    const-string v0, "ARMoudle.HwActivityRecognition"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "enableActivityEvent error:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 390
    :goto_0
    return v3
.end method

.method public e(Lo/vg;Lo/vm;)Z
    .locals 2

    .line 107
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "connectService"

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    .line 109
    :cond_0
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "connection or sink is null."

    invoke-static {v0, v1}, Lo/vj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    const/4 v0, 0x0

    return v0

    .line 112
    :cond_1
    iput-object p2, p0, Lo/ve;->a:Lo/vm;

    .line 113
    sget v0, Lo/ve;->h:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_2

    .line 114
    iget-object v0, p0, Lo/ve;->i:Lo/eep;

    if-nez v0, :cond_3

    .line 115
    invoke-direct {p0, p1}, Lo/ve;->a(Lo/vg;)Lo/eet;

    move-result-object v0

    iput-object v0, p0, Lo/ve;->k:Lo/eet;

    .line 116
    invoke-direct {p0}, Lo/ve;->o()V

    .line 118
    goto :goto_0

    .line 119
    :cond_2
    iget-object v0, p0, Lo/ve;->d:Lo/vk;

    if-nez v0, :cond_3

    .line 120
    invoke-direct {p0, p1}, Lo/ve;->d(Lo/vg;)Lo/vi;

    move-result-object v0

    iput-object v0, p0, Lo/ve;->c:Lo/vi;

    .line 121
    invoke-direct {p0}, Lo/ve;->o()V

    .line 125
    :cond_3
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
