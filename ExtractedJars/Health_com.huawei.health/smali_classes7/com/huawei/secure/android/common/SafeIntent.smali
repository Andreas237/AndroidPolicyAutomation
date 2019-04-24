.class public Lcom/huawei/secure/android/common/SafeIntent;
.super Landroid/content/Intent;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Intent;)V
    .locals 1

    .line 39
    if-nez p1, :cond_0

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 40
    return-void
.end method


# virtual methods
.method public getBooleanArrayExtra(Ljava/lang/String;)[Z
    .locals 2

    .line 214
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getBooleanArrayExtra(Ljava/lang/String;)[Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 215
    :catch_0
    move-exception v1

    .line 216
    const/4 v0, 0x0

    return-object v0
.end method

.method public getBooleanExtra(Ljava/lang/String;Z)Z
    .locals 2

    .line 72
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 73
    :catch_0
    move-exception v1

    .line 74
    return p2
.end method

.method public getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 2

    .line 223
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 224
    :catch_0
    move-exception v1

    .line 225
    const/4 v0, 0x0

    return-object v0
.end method

.method public getByteArrayExtra(Ljava/lang/String;)[B
    .locals 2

    .line 241
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 242
    :catch_0
    move-exception v1

    .line 243
    const/4 v0, 0x0

    return-object v0
.end method

.method public getByteExtra(Ljava/lang/String;B)B
    .locals 2

    .line 96
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/content/Intent;->getByteExtra(Ljava/lang/String;B)B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 97
    :catch_0
    move-exception v1

    .line 98
    return p2
.end method

.method public getCharArrayExtra(Ljava/lang/String;)[C
    .locals 2

    .line 250
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getCharArrayExtra(Ljava/lang/String;)[C
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 251
    :catch_0
    move-exception v1

    .line 252
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCharExtra(Ljava/lang/String;C)C
    .locals 2

    .line 120
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/content/Intent;->getCharExtra(Ljava/lang/String;C)C
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 121
    :catch_0
    move-exception v1

    .line 122
    return p2
.end method

.method public getCharSequenceArrayExtra(Ljava/lang/String;)[Ljava/lang/CharSequence;
    .locals 2

    .line 259
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getCharSequenceArrayExtra(Ljava/lang/String;)[Ljava/lang/CharSequence;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 260
    :catch_0
    move-exception v1

    .line 261
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCharSequenceArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/ArrayList<Ljava/lang/CharSequence;>;"
        }
    .end annotation

    .line 178
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getCharSequenceArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 179
    :catch_0
    move-exception v1

    .line 180
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCharSequenceExtra(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 2

    .line 108
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getCharSequenceExtra(Ljava/lang/String;)Ljava/lang/CharSequence;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 109
    :catch_0
    move-exception v1

    .line 110
    const/4 v0, 0x0

    return-object v0
.end method

.method public getDoubleArrayExtra(Ljava/lang/String;)[D
    .locals 2

    .line 268
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getDoubleArrayExtra(Ljava/lang/String;)[D
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 269
    :catch_0
    move-exception v1

    .line 270
    const/4 v0, 0x0

    return-object v0
.end method

.method public getDoubleExtra(Ljava/lang/String;D)D
    .locals 3

    .line 156
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    return-wide v0

    .line 157
    :catch_0
    move-exception v2

    .line 158
    return-wide p2
.end method

.method public getExtras()Landroid/os/Bundle;
    .locals 2

    .line 232
    :try_start_0
    invoke-super {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 233
    :catch_0
    move-exception v1

    .line 234
    const/4 v0, 0x0

    return-object v0
.end method

.method public getFloatArrayExtra(Ljava/lang/String;)[F
    .locals 2

    .line 277
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getFloatArrayExtra(Ljava/lang/String;)[F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 278
    :catch_0
    move-exception v1

    .line 279
    const/4 v0, 0x0

    return-object v0
.end method

.method public getFloatExtra(Ljava/lang/String;F)F
    .locals 2

    .line 144
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/content/Intent;->getFloatExtra(Ljava/lang/String;F)F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 145
    :catch_0
    move-exception v1

    .line 146
    return p2
.end method

.method public getIntArrayExtra(Ljava/lang/String;)[I
    .locals 2

    .line 286
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 287
    :catch_0
    move-exception v1

    .line 288
    const/4 v0, 0x0

    return-object v0
.end method

.method public getIntExtra(Ljava/lang/String;I)I
    .locals 2

    .line 84
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 85
    :catch_0
    move-exception v1

    .line 86
    return p2
.end method

.method public getIntegerArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 187
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getIntegerArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 188
    :catch_0
    move-exception v1

    .line 189
    const/4 v0, 0x0

    return-object v0
.end method

.method public getLongArrayExtra(Ljava/lang/String;)[J
    .locals 2

    .line 295
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getLongArrayExtra(Ljava/lang/String;)[J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 296
    :catch_0
    move-exception v1

    .line 297
    const/4 v0, 0x0

    return-object v0
.end method

.method public getLongExtra(Ljava/lang/String;J)J
    .locals 3

    .line 132
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    return-wide v0

    .line 133
    :catch_0
    move-exception v2

    .line 134
    return-wide p2
.end method

.method public getParcelableArrayExtra(Ljava/lang/String;)[Landroid/os/Parcelable;
    .locals 2

    .line 304
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getParcelableArrayExtra(Ljava/lang/String;)[Landroid/os/Parcelable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 305
    :catch_0
    move-exception v1

    .line 306
    const/4 v0, 0x0

    return-object v0
.end method

.method public getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::Landroid/os/Parcelable;>(Ljava/lang/String;)Ljava/util/ArrayList<TT;>;"
        }
    .end annotation

    .line 205
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 206
    :catch_0
    move-exception v1

    .line 207
    const/4 v0, 0x0

    return-object v0
.end method

.method public getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::Landroid/os/Parcelable;>(Ljava/lang/String;)TT;"
        }
    .end annotation

    .line 48
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 49
    :catch_0
    move-exception v1

    .line 50
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
    .locals 2

    .line 169
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 170
    :catch_0
    move-exception v1

    .line 171
    const/4 v0, 0x0

    return-object v0
.end method

.method public getShortArrayExtra(Ljava/lang/String;)[S
    .locals 2

    .line 332
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getShortArrayExtra(Ljava/lang/String;)[S
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 333
    :catch_0
    move-exception v1

    .line 334
    const/4 v0, 0x0

    return-object v0
.end method

.method public getShortExtra(Ljava/lang/String;S)S
    .locals 2

    .line 323
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/content/Intent;->getShortExtra(Ljava/lang/String;S)S
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 324
    :catch_0
    move-exception v1

    .line 325
    return p2
.end method

.method public getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;
    .locals 2

    .line 314
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 315
    :catch_0
    move-exception v1

    .line 316
    const/4 v0, 0x0

    return-object v0
.end method

.method public getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 196
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 197
    :catch_0
    move-exception v1

    .line 198
    const/4 v0, 0x0

    return-object v0
.end method

.method public getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 60
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 61
    :catch_0
    move-exception v1

    .line 62
    const/4 v0, 0x0

    return-object v0
.end method
