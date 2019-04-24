.class public final Lcom/myfitnesspal/shared/constants/Constants$Uris;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/myfitnesspal/shared/constants/Constants;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Uris"
.end annotation


# static fields
.field public static final MFP_APPGALLERY_API_BASE_URL:Ljava/lang/String; = "http://www.myfitnesspal.com"

.field public static final OAUTH2:Ljava/lang/String; = "/oauth2"

.field public static final REVOKE:Ljava/lang/String; = "/oauth2/revoke"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
