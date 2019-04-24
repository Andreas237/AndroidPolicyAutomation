.class public Lcom/huawei/nfc/carrera/server/card/impl/SignCommand;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final CITIC_SIGN_CONTENT_ACTIVATE_CARD:Ljava/lang/String; = "ACTIVATEACTION"

.field static final CITIC_SIGN_CONTENT_APPLY_AID_ACTION:Ljava/lang/String; = "APPLYIDCARDACTION"

.field static final CITIC_SIGN_CONTENT_APPLY_CARD_ACTION:Ljava/lang/String; = "APPLYCARDACTION"

.field static final CITIC_SIGN_CONTENT_BILLLIST:Ljava/lang/String; = "BILLLISTACTION"

.field static final CITIC_SIGN_CONTENT_NULLIFY:Ljava/lang/String; = "NULLIFYACTION"

.field static final CITIC_SIGN_CONTENT_PERSONALIZE:Ljava/lang/String; = "PERSONALIZEACTION"

.field static final CITIC_SIGN_CONTENT_QUERY_CASHLIMIT:Ljava/lang/String; = "CASHLIMITSEARCHACTION"

.field static final CITIC_SIGN_CONTENT_SET_CASHLIMIT:Ljava/lang/String; = "CASHLIMITACTION"

.field static final SIGN_CONTENT_CREATE_SSD:Ljava/lang/String; = "CREATESSDACTION"

.field static final SIGN_CONTENT_DELETE_SSD:Ljava/lang/String; = "DELETESSDACTION"

.field static final sCommands:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 74
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/server/card/impl/SignCommand;->sCommands:Ljava/util/HashMap;

    .line 78
    sget-object v0, Lcom/huawei/nfc/carrera/server/card/impl/SignCommand;->sCommands:Ljava/util/HashMap;

    const-string v1, "nfc.get.install.APP"

    const-string v2, "APPLYIDCARDACTION"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    sget-object v0, Lcom/huawei/nfc/carrera/server/card/impl/SignCommand;->sCommands:Ljava/util/HashMap;

    const-string v1, "nfc.get.del.APP"

    const-string v2, "NULLIFYACTION"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    sget-object v0, Lcom/huawei/nfc/carrera/server/card/impl/SignCommand;->sCommands:Ljava/util/HashMap;

    const-string v1, "nfc.get.create.SSD"

    const-string v2, "CREATESSDACTION"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    sget-object v0, Lcom/huawei/nfc/carrera/server/card/impl/SignCommand;->sCommands:Ljava/util/HashMap;

    const-string v1, "nfc.get.del.SSD"

    const-string v2, "DELETESSDACTION"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getSignCommand(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 91
    sget-object v0, Lcom/huawei/nfc/carrera/server/card/impl/SignCommand;->sCommands:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
