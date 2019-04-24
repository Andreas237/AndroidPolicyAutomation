.class public Lcom/huawei/ui/main/stories/nps/interactors/mode/Url;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final HOSTS:[Ljava/lang/String;

.field public static final HOSTS_ONLINE:[Ljava/lang/String;

.field public static final HOSTS_TEST:[Ljava/lang/String;

.field public static final K_CLOUD_FRAGEMENT_END:Ljava/lang/String; = "IB4hQWa2qra9LliDA6e9/qgL/9yUjVL0"

.field public static final OnLine_Host_Https:Ljava/lang/String; = "https://iservice.vmall.com/osg/"

.field public static final QstnGetDestSite:Ljava/lang/String; = "/secured/CCPC/EN/ccpcnps/getCountryInfo/1"

.field public static final QstnSurveyAnswer:Ljava/lang/String; = "secured/CCPC/EN/ccpcnps/submitSurveyV2/1"

.field public static final QstnSurveyRequest:Ljava/lang/String; = "secured/CCPC/EN/ccpcnps/getSurveyV2/1"

.field public static final ReportActivated:Ljava/lang/String; = "reportActivated.htm"

.field public static final Test_Host_Http:Ljava/lang/String; = "http://membernfive.hicloud.com:6362/osg/"

.field public static final Test_Host_Https:Ljava/lang/String; = "https://membernfive.hicloud.com:6364/osg/"


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 9
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "http://membernfive.hicloud.com:6362/osg/"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/main/stories/nps/interactors/mode/Url;->HOSTS:[Ljava/lang/String;

    .line 11
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "http://membernfive.hicloud.com:6362/osg/"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/main/stories/nps/interactors/mode/Url;->HOSTS_ONLINE:[Ljava/lang/String;

    .line 12
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "http://membernfive.hicloud.com:6362/osg/"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/main/stories/nps/interactors/mode/Url;->HOSTS_TEST:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
