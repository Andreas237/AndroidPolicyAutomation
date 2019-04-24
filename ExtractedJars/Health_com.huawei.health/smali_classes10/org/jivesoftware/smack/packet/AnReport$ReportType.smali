.class public final enum Lorg/jivesoftware/smack/packet/AnReport$ReportType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/packet/AnReport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ReportType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lorg/jivesoftware/smack/packet/AnReport$ReportType;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jivesoftware/smack/packet/AnReport$ReportType;

.field public static final enum FromServer:Lorg/jivesoftware/smack/packet/AnReport$ReportType;

.field public static final enum ToServer:Lorg/jivesoftware/smack/packet/AnReport$ReportType;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 26
    new-instance v0, Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    const-string v1, "FromServer"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/AnReport$ReportType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/AnReport$ReportType;->FromServer:Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    new-instance v0, Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    const-string v1, "ToServer"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/AnReport$ReportType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/AnReport$ReportType;->ToServer:Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    .line 24
    const/4 v0, 0x2

    new-array v0, v0, [Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    sget-object v1, Lorg/jivesoftware/smack/packet/AnReport$ReportType;->FromServer:Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/AnReport$ReportType;->ToServer:Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lorg/jivesoftware/smack/packet/AnReport$ReportType;->$VALUES:[Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 24
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/AnReport$ReportType;
    .locals 1

    .line 24
    const-class v0, Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    return-object v0
.end method

.method public static values()[Lorg/jivesoftware/smack/packet/AnReport$ReportType;
    .locals 1

    .line 24
    sget-object v0, Lorg/jivesoftware/smack/packet/AnReport$ReportType;->$VALUES:[Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    invoke-virtual {v0}, [Lorg/jivesoftware/smack/packet/AnReport$ReportType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    return-object v0
.end method
