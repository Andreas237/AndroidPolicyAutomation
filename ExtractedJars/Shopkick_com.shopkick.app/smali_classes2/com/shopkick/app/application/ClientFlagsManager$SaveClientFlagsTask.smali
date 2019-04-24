.class Lcom/shopkick/app/application/ClientFlagsManager$SaveClientFlagsTask;
.super Landroid/os/AsyncTask;
.source "ClientFlagsManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/ClientFlagsManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SaveClientFlagsTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private flagsJsonString:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppPreferences;Ljava/lang/String;)V
    .locals 0

    .line 294
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 295
    iput-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager$SaveClientFlagsTask;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 296
    iput-object p2, p0, Lcom/shopkick/app/application/ClientFlagsManager$SaveClientFlagsTask;->flagsJsonString:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 301
    iget-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager$SaveClientFlagsTask;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager$SaveClientFlagsTask;->flagsJsonString:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setClientFlagsJSON(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
