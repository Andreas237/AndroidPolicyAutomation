.class public Lcom/huawei/nfc/carrera/logic/swipe/channel/CardEmulationSwitch;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ENABLE_OVERRIDE_RECONFIGURED:I = 0x1

.field private static final FLAGS_LISTEN_MASK_DISAB_A_DISAB_B:I = 0x0

.field private static final FLAGS_LISTEN_MASK_ENAB_A_ENAB_B:I = 0x3

.field private static final TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 49
    const-class v0, Lcom/huawei/nfc/carrera/logic/swipe/channel/CardEmulationSwitch;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/swipe/channel/CardEmulationSwitch;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static disable(Landroid/content/Context;)V
    .locals 2

    .line 71
    const-string v0, "disable"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 72
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/swipe/channel/CardEmulationSwitch;->switchCardEmu(Landroid/content/Context;II)Z

    .line 73
    return-void
.end method

.method public static enable(Landroid/content/Context;)V
    .locals 2

    .line 59
    const-string v0, "enable"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 60
    const/4 v0, 0x1

    const/4 v1, 0x3

    invoke-static {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/swipe/channel/CardEmulationSwitch;->switchCardEmu(Landroid/content/Context;II)Z

    .line 61
    return-void
.end method

.method private static getNfcAdapter(Landroid/content/Context;)Landroid/nfc/NfcAdapter;
    .locals 3

    .line 184
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 186
    const/4 v0, 0x0

    return-object v0

    .line 189
    :cond_0
    const-string v0, "nfc"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/nfc/NfcManager;

    .line 190
    const/4 v0, 0x0

    if-ne v0, v1, :cond_1

    .line 192
    const/4 v0, 0x0

    return-object v0

    .line 195
    :cond_1
    invoke-virtual {v1}, Landroid/nfc/NfcManager;->getDefaultAdapter()Landroid/nfc/NfcAdapter;

    move-result-object v2

    .line 196
    const/4 v0, 0x0

    if-ne v0, v2, :cond_2

    .line 198
    const/4 v0, 0x0

    return-object v0

    .line 201
    :cond_2
    return-object v2
.end method

.method private static switchCardEmu(Landroid/content/Context;II)Z
    .locals 10

    .line 104
    const/4 v4, 0x0

    .line 107
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/swipe/channel/CardEmulationSwitch;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enableCardEmulation. enableOverride=="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    invoke-static {p0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/CardEmulationSwitch;->getNfcAdapter(Landroid/content/Context;)Landroid/nfc/NfcAdapter;

    move-result-object v5

    .line 110
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 113
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 114
    const-string v0, "fail_reason"

    const-string v1, "enableCardEmulation. adapter is null"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    const-string v0, "fail_code"

    const-string v1, "switchCardEmu"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    const-string v0, "enableCardEmulation. adapter is null."

    const v1, 0x3611a3ed

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v6, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_4

    .line 117
    return v4

    .line 120
    :cond_0
    const-string v0, "com.nxp.nfc.NxpNfcAdapter"

    :try_start_1
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    .line 121
    const-string v0, "getNxpNfcAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Landroid/nfc/NfcAdapter;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    .line 123
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v5, v0, v1

    const/4 v1, 0x0

    invoke-virtual {v7, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    .line 126
    const-string v0, "SetListenTechMask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v6, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    .line 128
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 129
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 128
    invoke-virtual {v9, v8, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_4

    .line 131
    const/4 v0, 0x1

    return v0

    .line 133
    :catch_0
    move-exception v5

    .line 136
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 137
    const-string v0, "fail_reason"

    const-string v1, "NoSuchMethodException"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    const-string v0, "fail_code"

    const-string v1, "switchCardEmu"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    const-string v0, "switchCardEmu NoSuchMethodException"

    const v1, 0x3611a3ed

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v6, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 172
    goto/16 :goto_0

    .line 141
    :catch_1
    move-exception v5

    .line 144
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 145
    const-string v0, "fail_reason"

    const-string v1, "ClassNotFoundException"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    const-string v0, "fail_code"

    const-string v1, "switchCardEmu"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    const-string v0, "switchCardEmu ClassNotFoundException"

    const v1, 0x3611a3ed

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v6, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 172
    goto/16 :goto_0

    .line 149
    :catch_2
    move-exception v5

    .line 152
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 153
    const-string v0, "fail_reason"

    const-string v1, "IllegalArgumentException"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    const-string v0, "fail_code"

    const-string v1, "switchCardEmu"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    const-string v0, "switchCardEmu IllegalArgumentException"

    const v1, 0x3611a3ed

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v6, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 172
    goto :goto_0

    .line 157
    :catch_3
    move-exception v5

    .line 160
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 161
    const-string v0, "fail_reason"

    const-string v1, "IllegalAccessException"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    const-string v0, "fail_code"

    const-string v1, "switchCardEmu"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    const-string v0, "switchCardEmu IllegalAccessException"

    const v1, 0x3611a3ed

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v6, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 172
    goto :goto_0

    .line 165
    :catch_4
    move-exception v5

    .line 168
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 169
    const-string v0, "fail_reason"

    const-string v1, "InvocationTargetException"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    const-string v0, "fail_code"

    const-string v1, "switchCardEmu"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    const-string v0, "switchCardEmu InvocationTargetException"

    const v1, 0x3611a3ed

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v6, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 174
    :goto_0
    const/4 v0, 0x0

    return v0
.end method
