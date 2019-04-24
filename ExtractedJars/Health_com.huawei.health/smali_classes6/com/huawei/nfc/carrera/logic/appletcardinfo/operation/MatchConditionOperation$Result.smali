.class Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Result"
.end annotation


# instance fields
.field result:Ljava/lang/String;

.field value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;->value:Ljava/lang/String;

    .line 114
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/MatchConditionOperation$Result;->result:Ljava/lang/String;

    .line 115
    return-void
.end method
