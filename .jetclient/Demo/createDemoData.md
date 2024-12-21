```toml
name = 'createDemoData'
method = 'POST'
url = 'http://localhost:8082/api/v1/demodata'
sortWeight = 2000000
id = '23333cda-5d00-42c9-b64b-a1e467bbae72'

[body]
type = 'JSON'
raw = '''
{
  "id": 3,
  "name": "Joey",
  "email": "Joey@email.com",
  "phone": "0000000",
  "address": "A75 Bangkok Thailand"
}'''
```
