.class Lo/ve$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ve;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/huawei/android/location/activityrecognition/OtherParameters;

.field private b:Ljava/lang/String;

.field private d:I

.field private e:J


# direct methods
.method public constructor <init>(Ljava/lang/String;IJLcom/huawei/android/location/activityrecognition/OtherParameters;)V
    .locals 0

    .line 871
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 872
    iput-object p1, p0, Lo/ve$a;->b:Ljava/lang/String;

    .line 873
    iput p2, p0, Lo/ve$a;->d:I

    .line 874
    iput-wide p3, p0, Lo/ve$a;->e:J

    .line 875
    iput-object p5, p0, Lo/ve$a;->a:Lcom/huawei/android/location/activityrecognition/OtherParameters;

    .line 876
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 854
    iget-object v0, p0, Lo/ve$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 858
    iget v0, p0, Lo/ve$a;->d:I

    return v0
.end method

.method public d()J
    .locals 2

    .line 862
    iget-wide v0, p0, Lo/ve$a;->e:J

    return-wide v0
.end method
